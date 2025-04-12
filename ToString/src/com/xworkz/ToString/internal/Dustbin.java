package com.xworkz.ToString.internal;

public class Dustbin {
    private String material;
    private int capacity;
    private String color;

    public Dustbin(String material, int capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin material: " + this.material + ", capacity: " + this.capacity + "L, color: " + this.color;
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
            if(object instanceof Dustbin) {
                System.out.println("ref is Dustbin, will compare...");
                Dustbin dustbin = this;
                Dustbin dustbin1 = (Dustbin) object;
                if(dustbin.material.equals(dustbin1.material) &&
                        dustbin.capacity == dustbin1.capacity &&
                        dustbin.color.equals(dustbin1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}