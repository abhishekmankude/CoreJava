package com.xworkz.ToString.internal;

public class Charger {
    private String brand;
    private int wattage;
    private int price;

    public Charger(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Charger brand: " + this.brand + ", wattage: " + this.wattage + "W, price: " + this.price;
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
            if(object instanceof Charger) {
                System.out.println("ref is Charger, will compare...");
                Charger charger = this;
                Charger charger1 = (Charger) object;
                if(charger.brand.equals(charger1.brand) &&
                        charger.wattage == charger1.wattage &&
                        charger.price == charger1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}