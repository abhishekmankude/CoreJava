package com.xworkz.ToString.internal;

public class WoodenBox {
    private String material;
    private String shape;
    private int weight;

    public WoodenBox(String material, String shape, int weight) {
        this.material = material;
        this.shape = shape;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WoodenBox material: " + material + ", shape: " + shape + ", weight: " + weight + "kg";
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
            if(object instanceof WoodenBox) {
                System.out.println("ref is WoodenBox, will compare...");
                WoodenBox box = this;
                WoodenBox box1 = (WoodenBox) object;
                if(box.material.equals(box1.material) && box.shape.equals(box1.shape) && box.weight == box1.weight) {
                    return true;
                }
            }
        }
        return false;
    }
}