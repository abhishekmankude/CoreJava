package com.xworkz.ToString.internal;


public class Charger {
    private  String brand;
    private int wattage;
    private int price;

    public Charger(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Adapter brand: " + this.brand + ", wattage: " + this.wattage + "W, price: " + this.price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
