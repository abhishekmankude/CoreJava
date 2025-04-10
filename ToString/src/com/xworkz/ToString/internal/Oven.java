package com.xworkz.ToString.internal;

public class Oven {
    private String type;
    private int capacity;
    private int price;
    public Oven(String type, int capacity, int price) {
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Oven type " + this.type + " capacity " + this.capacity + " price " + this.price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
