package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Refrigerator;

public class DoubleDoorRefrigerator extends Refrigerator {
    public DoubleDoorRefrigerator() {
        System.out.println("DoubleDoorRefrigerator is running in DoubleDoorRefrigerator");
    }
    @Override
    public void coolingSystem() {
        System.out.println("Cooling system is running in DoubleDoorRefrigerator");
    }
    public void capacity() {
        System.out.println("Capacity is running in DoubleDoorRefrigerator");
    }
    public void brand() {
        System.out.println("Brand is running in DoubleDoorRefrigerator");
    }
    public void price() {
        System.out.println("Price is running in DoubleDoorRefrigerator");
    }
}