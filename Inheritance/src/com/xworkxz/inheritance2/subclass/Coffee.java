package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Beverages;

public class Coffee extends Beverages {
    public Coffee() {
        System.out.println("No argument constructor in Coffee");
    }
    @Override
    public void temperature() {
        System.out.println("Temperature is running in Coffee");
    }
    public void volume() {
        System.out.println("Volume is running in Coffee");
    }
    public void brand() {
        System.out.println("Brand is running in Coffee");
    }
    public void ingredients() {
        System.out.println("Ingredients is running in Coffee");
    }
    public void price() {
        System.out.println("Price is running in Coffee");
    }
}