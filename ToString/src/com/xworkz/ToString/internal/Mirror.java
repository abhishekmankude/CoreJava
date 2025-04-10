package com.xworkz.ToString.internal;

public class Mirror {
    private String shape;
    private int height;
    private int price;

    public Mirror(String shape, int height, int price) {
        this.shape = shape;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mirror shape: " + shape + ", height: " + height + "cm, price: " + price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
