package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Bakery;

public class Bread extends Bakery {
    public Bread() {
        System.out.println("No argument constructor in Bread");
    }
@Override
    public void type() {
        System.out.println("Type is running in Bread");
    }
    public void sweetness() {
        System.out.println("Sweetness is running in Bread");
    }
    public void ingredients() {
        System.out.println("Ingredients is running in Bread");
    }
    public void origin() {
        System.out.println("Origin is running in Bread");
    }
    public void price() {
        System.out.println("Price is running in Bread");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
