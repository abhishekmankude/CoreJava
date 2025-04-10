package com.xworkz.ToString.internal;

public class Watch {
    private String brand;
    private String style;
    private int price;
     public Watch(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Watch brand " + this.brand + " style " + this.style + " price " + this.price;
    }
}
