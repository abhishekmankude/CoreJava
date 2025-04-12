package com.xworkz.ToString.internal;

public class Belt {
    private String material;
    private String size;
    private int price;

    public Belt(String material, String size, int price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Belt material: " + this.material + ", size: " + this.size + ", price: " + this.price;
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
                if(belt.material.equals(belt1.material) && belt.size.equals(belt1.size) && belt.price == belt1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}