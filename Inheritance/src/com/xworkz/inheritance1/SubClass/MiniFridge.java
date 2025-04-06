package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Refrigerator;

public class MiniFridge extends Refrigerator {
    public MiniFridge() {
        System.out.println("MiniFridge is running in MiniFridge");
    }
    @Override
    public void coolingSystem() {
        System.out.println("Cooling system is running in MiniFridge");
    }
    public void capacity() {
        System.out.println("Capacity is running in MiniFridge");
    }
    public void brand() {
        System.out.println("Brand is running in MiniFridge");
    }
    public void price() {
        System.out.println("Price is running in MiniFridge");
    }

}