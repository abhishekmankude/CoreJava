package com.access.packages;

public class Bottle {
    public String brand;
    private double price;
    int capacity;

    public Bottle() {
        this.brand = "Milton";
        this.price = 499.99;
        this.capacity = 1000;
    }

    public void displayBrand() {
        System.out.println("Bottle Brand: " + brand);
    }

    private void displayPrice() {
        System.out.println("Price: ₹" + price);
    }

    void displayCapacity() {
        System.out.println("Capacity: " + capacity + "ml");
    }

    public void priceInfo() {
        displayPrice();
    }
}
