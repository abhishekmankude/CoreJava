package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Nuts;

public class Almond extends Nuts {
    public Almond() {
        System.out.println("No argument constructor in Almond");
    }
@Override
    public void type() {
        System.out.println("Type is running in Almond");
    }
    public void crunchiness() {
        System.out.println("Crunchiness is running in Almond");
    }
    public void nutritionalValue() {
        System.out.println("Nutritional value is running in Almond");
    }
    public void origin() {
        System.out.println("Origin is running in Almond");
    }
    public void price() {
        System.out.println("Price is running in Almond");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
