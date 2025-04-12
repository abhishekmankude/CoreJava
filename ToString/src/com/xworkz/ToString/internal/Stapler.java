package com.xworkz.ToString.internal;

public class Stapler {
    private String brand;
    private int pinsCapacity;
    private int price;

    public Stapler(String brand, int pinsCapacity, int price) {
        this.brand = brand;
        this.pinsCapacity = pinsCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stapler brand: " + brand + ", pinsCapacity: " + pinsCapacity + ", price: " + price;
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
            if(object instanceof Stapler) {
                System.out.println("ref is Stapler, will compare...");
                Stapler stapler = this;
                Stapler stapler1 = (Stapler) object;
                if(stapler.brand.equals(stapler1.brand) && stapler.pinsCapacity == stapler1.pinsCapacity && stapler.price == stapler1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}