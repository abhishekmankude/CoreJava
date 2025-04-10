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
        return "Milk brand: " +  this.brand + ", volume: " +  this.volume + "ml, price: " +  this.price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }

}
