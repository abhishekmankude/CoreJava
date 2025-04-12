package com.xworkz.ToString.internal;

public class Wire {
    private String material;
    private int length;
    private String color;

    public Wire(String material, int length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wire material: " + material + ", length: " + length + " meters, color: " + color;
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
            if(object instanceof Wire) {
                System.out.println("ref is Wire, will compare...");
                Wire wire = this;
                Wire wire1 = (Wire) object;
                if(wire.material.equals(wire1.material) && wire.length == wire1.length && wire.color.equals(wire1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}