package com.xworkz.ToString.internal;

public class Pant {
    private String brand;
    private String color;
    private int cost;

    public Pant(String brand, String color, int cost) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pant brand: " + brand + ", color: " + color + ", cost: " + cost;
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
            if(object instanceof Pant) {
                System.out.println("ref is Pant, will compare...");
                Pant pant = this;
                Pant pant1 = (Pant) object;
                if(pant.brand.equals(pant1.brand) && pant.color.equals(pant1.color) && pant.cost == pant1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}