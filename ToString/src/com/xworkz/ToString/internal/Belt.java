package com.xworkz.ToString.internal;

public class Belt {
    private String material;

    public Belt(String material) {
        this.material = material;

    }

    @Override
    public String toString() {
        return "Belt material: " + this.material ;
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
            if(object instanceof Belt) {
                System.out.println("ref is Belt, will compare...");
                Belt belt = this;
                Belt belt1 = (Belt) object;
                if(belt.material.equals(belt1.material)) {
                    return true;
                }
            }
        }
        return false;
    }
}