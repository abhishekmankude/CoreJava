package com.xworkz.ToString.internal;

public class Towel {
    private String material;
    private String color;
    private int length;

    public Towel(String material, String color, int length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Towel material: " + material + ", color: " + color + ", length: " + length;
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
            if(object instanceof Towel) {
                System.out.println("ref is Towel, will compare...");
                Towel towel = this;
                Towel towel1 = (Towel) object;
                if(towel.material.equals(towel1.material) && towel.color.equals(towel1.color) && towel.length == towel1.length) {
                    return true;
                }
            }
        }
        return false;
    }
}