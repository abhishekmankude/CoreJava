package com.xworkz.ToString.internal;

public class Chappal {
    private String brand;
    private String size;
    private int price;

    public Chappal(String brand, String size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chappla brand " + this.brand + " size " + this.size + " price " + this.price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
