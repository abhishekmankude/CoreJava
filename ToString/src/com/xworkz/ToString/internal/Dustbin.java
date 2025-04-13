package com.xworkz.ToString.internal;

public class Dustbin {
    private String material;


    public Dustbin(String material) {
        this.material = material;

    }

    @Override
    public String toString() {
        return "Dustbin material: " + this.material + ", capacity: ";
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not   null");
            if(object instanceof Dustbin) {
                System.out.println("ref is Dustbin, will compare...");
                Dustbin dustbin = this;
                Dustbin dustbin1 = (Dustbin) object;
                if(dustbin.material.equals(dustbin1.material)) {
                     return true;
                }
            }
        }
        return false;
    }
}