package com.xworkz.ToString.internal;

public class Umbrella {
    private String color;
    private int length;
    private int price;

    public Umbrella(String color, int length, int price) {
        this.color = color;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Umbrella color: " + color + ", length: " + length + "cm, price: " + price;
    }


}
