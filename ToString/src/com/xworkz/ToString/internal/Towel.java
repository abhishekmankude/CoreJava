package com.xworkz.ToString.internal;

public class Towel {
    private String material;
    private String color;
    private int length;

    public Towel(String material, String color, int length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Towel material: " + material + ", color: " + color + ", length: " + length;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
