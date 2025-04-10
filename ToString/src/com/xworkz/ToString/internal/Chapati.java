package com.xworkz.ToString.internal;

public class Chapati {
    private String flourType;
    private int quantity;
    private int price;

    public Chapati(String flourType, int quantity, int price) {
        this.flourType = flourType;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chapati flour type: " +  this.flourType + ", quantity: " +  this.quantity + ", price: " +  this.price;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
