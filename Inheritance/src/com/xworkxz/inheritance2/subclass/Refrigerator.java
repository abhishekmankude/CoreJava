package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Appliance;

public class Refrigerator extends Appliance {
    public Refrigerator() { System.out.println("Refrigerator constructor"); }
@Override
public void plugIn() { System.out.println("Refrigerator plugged in"); }
    public void unplug() { System.out.println("Refrigerator unplugged"); }
    public void operate() { System.out.println("Refrigerator operating"); }
    public void maintain() { System.out.println("Refrigerator being maintained"); }
    public void repair() { System.out.println("Refrigerator being repaired"); }
    public void country(){
        System.out.println("Country is Running");
    }}