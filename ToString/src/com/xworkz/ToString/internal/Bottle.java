package com.xworkz.ToString.internal;

public class Bottle {
    private String brand;
    private String color;
    private int capacity;

    public Bottle(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bottle brand: " + this.brand + ", color: " + this.color + ", capacity: " + this.capacity + "ml";
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
            if(object instanceof Bottle) {
                System.out.println("ref is Bottle, will compare...");
                Bottle bottle = this;
                Bottle bottle1 = (Bottle) object;
                if(bottle.brand.equals(bottle1.brand) && bottle.color.equals(bottle1.color) && bottle.capacity == bottle1.capacity) {
                    return true;
                }
            }
        }
        return false;
    }
}