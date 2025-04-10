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
        return "Door material: " + material + ", height: " + height + "cm, price: " + price;
    }


    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
