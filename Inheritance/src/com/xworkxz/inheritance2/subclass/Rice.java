package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Grains;

public class Rice extends Grains {
    public Rice() {
        System.out.println("No argument constructor in Rice");
    }
    @Override
    public void type() {
        System.out.println("Type is running in Rice");
    }
    public void weight() {
        System.out.println("Weight is running in Rice");
    }
    public void nutritionalValue() {
        System.out.println("Nutritional value is running in Rice");
    }
    public void origin() {
        System.out.println("Origin is running in Rice");
    }
    public void price() {
        System.out.println("Price is running in Rice");
    }public void country(){
        System.out.println("Country is Running");
    }
}