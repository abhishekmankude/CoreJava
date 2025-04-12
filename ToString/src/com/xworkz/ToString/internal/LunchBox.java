package com.xworkz.ToString.internal;

public class LunchBox {
    private String brand;
    private int containers;
    private int price;

    public LunchBox(String brand, int containers, int price) {
        this.brand = brand;
        this.containers = containers;
        this.price = price;
    }

    @Override
    public String toString() {

        return "LunchBox brand: " + brand + ", containers: " + containers + ", price: " + price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
