package com.xworkxz.inheritance2.subclass;


import com.xworkxz.inheritance2.superclass.Meat;

public class Chicken extends Meat {
    public Chicken() {
        System.out.println("No argument constructor in Chicken");
    }
    @Override
    public void type() {
        System.out.println("Type is running in Chicken");
    }
    public void weight() {
        System.out.println("Weight is running in Chicken");
    }
    public void freshness() {
        System.out.println("Freshness is running in Chicken");
    }
    public void origin() {
        System.out.println("Origin is running in Chicken");
    }
    public void price() {
        System.out.println("Price is running in Chicken");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}