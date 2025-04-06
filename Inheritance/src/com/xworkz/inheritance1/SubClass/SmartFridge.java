package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Refrigerator;

public class SmartFridge extends Refrigerator {
    public SmartFridge() {
        System.out.println("SmartFridge is running in SmartFridge");
    }
    @Override
    public void coolingSystem() {
        System.out.println("Cooling system is running in SmartFridge");
    }
    public void capacity() {
        System.out.println("Capacity is running in SmartFridge");
    }
    public void brand() {
        System.out.println("Brand is running in SmartFridge");
    }
    public void price() {
        System.out.println("Price is running in SmartFridge");
    }

}