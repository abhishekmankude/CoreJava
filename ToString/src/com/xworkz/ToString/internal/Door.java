package com.xworkz.ToString.internal;

public class Door {
    private String material;


    public Door(String material) {
        this.material = material;

    }

    @Override
    public String toString() {
        return "Door material: " + this.material + ", height: " ;
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
            if(object instanceof Door) {
                System.out.println("ref is Door, will compare...");
                Door door = this;
                Door door1 = (Door) object;
                if(door.material.equals(door1.material)) {
                    return true;
                }
            }
        }
        return false;
    }
}