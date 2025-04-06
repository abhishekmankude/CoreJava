package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Refrigerator;

public class SideBySideRefrigerator extends Refrigerator {
    public SideBySideRefrigerator() {
        System.out.println("SideBySideRefrigerator is running in SideBySideRefrigerator");
    }

@Override
public void coolingSystem() {
    System.out.println("Cooling system is running in SideBySideRefrigerator");
}
    public void capacity() {
        System.out.println("Capacity is running in SideBySideRefrigerator");
    }
    public void brand() {
        System.out.println("Brand is running in SideBySideRefrigerator");
    }
    public void price() {
        System.out.println("Price is running in SideBySideRefrigerator");
    }}
