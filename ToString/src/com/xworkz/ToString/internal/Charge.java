package com.xworkz.ToString.internal;

public class Charge {
    private String type;
    private String company;
    private int capacity;

    public Charge(String type, String company, int capacity) {
        this.type = type;
        this.company = company;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery type " + this.type + " company " + this.company + " capacity" + this.capacity+"V";
    }
}
