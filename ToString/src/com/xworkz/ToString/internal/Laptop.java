package com.xworkz.ToString.internal;

public class Laptop {
    private String brand;
    private String processor;
    private int price;

    public Laptop(String brand, String processor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop brand " + this.brand + " processor " + this.processor + " Laptop Price " + this.price ;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
