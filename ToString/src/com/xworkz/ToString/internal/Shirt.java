package com.xworkz.ToString.internal;

public class Shirt {
    private String brand;
    private String color;
    private int cost;

    public Shirt(String brand, String color, int cost) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shirt brand: " + brand + ", color: " + color + ", cost: " + cost;
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
            if(object instanceof Shirt) {
                System.out.println("ref is Shirt, will compare...");
                Shirt shirt = this;
                Shirt shirt1 = (Shirt) object;
                if(shirt.brand.equals(shirt1.brand) && shirt.color.equals(shirt1.color) && shirt.cost == shirt1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}