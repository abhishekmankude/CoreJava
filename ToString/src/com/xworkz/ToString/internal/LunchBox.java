package com.xworkz.ToString.internal;

public class LunchBox {
    private String brand;
    private int containers;


    public LunchBox(String brand, int containers) {
        this.brand = brand;
        this.containers = containers;

    }

    @Override
    public String toString() {

        return "LunchBox brand: " + brand + ", containers: " + containers;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
