package com.xworkz.ToString.internal;

public class Milk {
    private String brand;
    private int volume;
    private int price;

    public Milk(String brand, int volume, int price) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk brand: " + brand + ", volume: " + volume + "ml, price: " + price;
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
            if(object instanceof Milk) {
                System.out.println("ref is Milk, will compare...");
                Milk milk = this;
                Milk milk1 = (Milk) object;
                if(milk.brand.equals(milk1.brand) && milk.volume == milk1.volume && milk.price == milk1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}