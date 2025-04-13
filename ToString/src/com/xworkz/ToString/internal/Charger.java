package com.xworkz.ToString.internal;

public class Charger {
    private String brand;


    public Charger(String brand) {
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Charger brand: " + this.brand + ", wattage: ";
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
                if(charger.brand.equals(charger1.brand)) {
                    return true;
                }
            }
        }
        return false;
    }
}