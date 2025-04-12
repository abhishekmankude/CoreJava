package com.xworkz.ToString.internal;

public class Door {
    private String material;
    private int height;
    private int price;

    public Door(String material, int height, int price) {
        this.material = material;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door material: " + this.material + ", height: " + this.height + "cm, price: " + this.price;
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
                if(door.material.equals(door1.material) &&
                        door.height == door1.height &&
                        door.price == door1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}