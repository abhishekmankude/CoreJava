package com.xworkz.ToString.internal;

public class HeadPhone {
    private String brand;
    private String type;
    private int price;
    public HeadPhone(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Headphones brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
