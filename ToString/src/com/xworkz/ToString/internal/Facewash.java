package com.xworkz.ToString.internal;

public class Facewash {
    private String brand;
    private int volume;
    private int price;

    public Facewash(String brand, int volume, int price) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facewash brand: " + brand + ", volume: " + volume + "ml, price: " + price;
    }
}
