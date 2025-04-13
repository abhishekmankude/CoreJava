package com.xworkz.ToString.internal;

public class Fridge {
    private String brand;
    private int capacity;

    public Fridge(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "Fridge brand: " + this.brand + ", capacity: " + this.capacity ;
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
            if(object instanceof Fridge) {
                System.out.println("ref is Fridge, will compare...");
                Fridge fridge = this;
                Fridge fridge1 = (Fridge) object;
                if(fridge.brand.equals(fridge1.brand) &&
                        fridge.capacity == fridge1.capacity) {
                    return true;
                }
            }
        }
        return false;
    }
}