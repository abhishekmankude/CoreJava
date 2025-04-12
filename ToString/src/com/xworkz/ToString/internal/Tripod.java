package com.xworkz.ToString.internal;

public class Tripod {
    private String material;
    private int maxHeight;
    private int price;

    public Tripod(String material, int maxHeight, int price) {
        this.material = material;
        this.maxHeight = maxHeight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tripod material: " + material + ", max height: " + maxHeight + "cm, price: " + price;
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
            if(object instanceof Tripod) {
                System.out.println("ref is Tripod, will compare...");
                Tripod tripod = this;
                Tripod tripod1 = (Tripod) object;
                if(tripod.material.equals(tripod1.material) && tripod.maxHeight == tripod1.maxHeight && tripod.price == tripod1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}