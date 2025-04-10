package com.xworkz.ToString.internal;

public class PowerBank {
    private String brand;
    private int capacity;
    private int price;

    public PowerBank(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PowerBank brand " + this.brand + " capacity " + this.capacity + " price " + this.price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
