package com.xworkz.ToString.internal;

public class Cake {
    private String bakeryName;
    private String flavour;
    private int price;

    public Cake(String bakeryName,String flavour,int price){
        this.bakeryName=bakeryName;
        this.flavour=flavour;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Cake Bakery Name "+this.bakeryName+" Cake price "+this.price+" Pant flavour "+this.flavour;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
