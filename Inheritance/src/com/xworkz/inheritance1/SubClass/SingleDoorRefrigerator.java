package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Refrigerator;

public class SingleDoorRefrigerator extends Refrigerator {
    public SingleDoorRefrigerator() {
        System.out.println("SingleDoorRefrigerator is running in SingleDoorRefrigerator");
    }
    @Override
    public void coolingSystem() {
        System.out.println("Cooling system is running in SingleDoorRefrigerator");
    }
    public void capacity() {
        System.out.println("Capacity is running in SingleDoorRefrigerator");
    }
    public void brand() {
        System.out.println("Brand is running in SingleDoorRefrigerator");
    }
    public void price() {
        System.out.println("Price is running in SingleDoorRefrigerator");
    }

}