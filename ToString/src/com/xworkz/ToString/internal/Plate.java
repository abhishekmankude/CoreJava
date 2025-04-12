package com.xworkz.ToString.internal;

public class Plate {
    private String material;
    private int diameter;
    private int price;

    public Plate(String material, int diameter, int price) {
        this.material = material;
        this.diameter = diameter;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plate material: " + material + ", diameter: " + diameter + "cm, price: " + price;
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
            if(object instanceof Plate) {
                System.out.println("ref is Plate, will compare...");
                Plate plate = this;
                Plate plate1 = (Plate) object;
                if(plate.material.equals(plate1.material) && plate.diameter == plate1.diameter && plate.price == plate1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}