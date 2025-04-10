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
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
