package com.xworkz.ToString.internal;

public class Avocado
{
    private String variety;
    private int weight;
    private int price;

    public Avocado(String  variety, int weight, int price) {
        this.variety = variety;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple variety: " +  this.variety + ", weight: " +  this.weight + "g, price: " +  this.price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
