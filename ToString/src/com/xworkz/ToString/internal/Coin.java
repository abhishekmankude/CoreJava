package com.xworkz.ToString.internal;

public class Coin {
    private String coinName;
    private String material;
    private int year;

    public Coin(String coinName, String material, int year) {
        this.coinName = coinName;
        this.material = material;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin denomination " + this.coinName + " material " + this.material + " year " + this.year;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
