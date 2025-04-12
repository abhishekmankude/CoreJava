package com.xworkz.ToString.internal;

public class Wallet {
    private String brand;
    private String material;
    private int price;

    public Wallet(String brand, String material, int price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wallet brand: " + brand + ", material: " + material + ", price: " + price;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof Wallet) {
                System.out.println("ref is Wallet, will compare...");
                Wallet wallet = this;
                Wallet wallet1 = (Wallet) object;
                if(wallet.brand.equals(wallet1.brand) && wallet.material.equals(wallet1.material) && wallet.price == wallet1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}