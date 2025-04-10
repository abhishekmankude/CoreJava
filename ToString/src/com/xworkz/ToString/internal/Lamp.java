package com.xworkz.ToString.internal;

public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lamp type " + this.type + " color " + this.color + " price " + this.price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
