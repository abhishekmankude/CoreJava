package com.xworkz.ToString.internal;

public class Scooter {
    private String brand;
    private String model;
    private int price;

    public Scooter(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Scooter brand: " + brand + ", model: " + model + ", price: " + price;
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
            if(object instanceof Scooter) {
                System.out.println("ref is Scooter, will compare...");
                Scooter scooter = this;
                Scooter scooter1 = (Scooter) object;
                if(scooter.brand.equals(scooter1.brand) && scooter.model.equals(scooter1.model) && scooter.price == scooter1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}