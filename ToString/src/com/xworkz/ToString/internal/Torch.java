package com.xworkz.ToString.internal;

public class Torch {
    private String brand;
    private int lumens;
    private int price;

    public Torch(String brand, int lumens, int price) {
        this.brand = brand;
        this.lumens = lumens;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Torch brand: " + brand + ", lumens: " + lumens + ", price: " + price;
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
            if(object instanceof Torch) {
                System.out.println("ref is Torch, will compare...");
                Torch torch = this;
                Torch torch1 = (Torch) object;
                if(torch.brand.equals(torch1.brand) && torch.lumens == torch1.lumens && torch.price == torch1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}