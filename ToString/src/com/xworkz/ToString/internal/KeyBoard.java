package com.xworkz.ToString.internal;

public class KeyBoard {
    private String brand;
    private int noOfKeys;
    private int price;

    public KeyBoard(String brand, int noOfKeys, int price) {
        this.brand = brand;
        this.noOfKeys = noOfKeys ;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard brand " + this.brand + " noofKeys " + this.noOfKeys + " price " + this.price ;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
