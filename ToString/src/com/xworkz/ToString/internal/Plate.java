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
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }

}
