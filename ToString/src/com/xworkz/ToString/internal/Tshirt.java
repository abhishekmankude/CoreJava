package com.xworkz.ToString.internal;

public class Tshirt {
    private String brand;
    private String color;
    private int cost;

    public Tshirt(String brand, String color, int cost) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tshirt brand: " + brand + ", color: " + color + ", cost: " + cost;
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
            if(object instanceof Tshirt) {
                System.out.println("ref is Tshirt, will compare...");
                Tshirt tshirt = this;
                Tshirt tshirt1 = (Tshirt) object;
                if(tshirt.brand.equals(tshirt1.brand) && tshirt.color.equals(tshirt1.color) && tshirt.cost == tshirt1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}