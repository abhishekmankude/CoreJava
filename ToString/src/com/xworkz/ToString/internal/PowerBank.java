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
        return "PowerBank brand: " + brand + ", capacity: " + capacity + ", price: " + price;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof PowerBank) {
                System.out.println("ref is PowerBank, will compare...");
                PowerBank powerBank = this;
                PowerBank powerBank1 = (PowerBank) object;
                if(powerBank.brand.equals(powerBank1.brand) && powerBank.capacity == powerBank1.capacity && powerBank.price == powerBank1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}