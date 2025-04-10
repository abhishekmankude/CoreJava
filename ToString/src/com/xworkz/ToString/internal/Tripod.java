package com.xworkz.ToString.internal;

public class Tripod {
    private String material;
    private int maxHeight;
    private int price;

    public Tripod(String material, int maxHeight, int price) {
        this.material = material;
        this.maxHeight = maxHeight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tripod material: " + material + ", max height: " + maxHeight + "cm, price: " + price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
