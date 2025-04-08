package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Spices;

public class Cinnamon extends Spices {
    public Cinnamon() {
        System.out.println("No argument constructor in Cinnamon");
    }
    @Override

    public void type() {
        System.out.println("Type is running in Cinnamon");
    }
    public void aroma() {
        System.out.println("Aroma is running in Cinnamon");
    }
    public void heatLevel() {
        System.out.println("Heat level is running in Cinnamon");
    }
    public void origin() {
        System.out.println("Origin is running in Cinnamon");
    }
    public void price() {
        System.out.println("Price is running in Cinnamon");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
