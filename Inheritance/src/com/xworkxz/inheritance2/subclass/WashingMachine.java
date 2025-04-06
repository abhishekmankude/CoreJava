package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.HomeAppliance;

public class WashingMachine extends HomeAppliance {
    public WashingMachine() { System.out.println("WashingMachine constructor"); }

@Override
public void install() { System.out.println("WashingMachine being installed"); }
    public void operate() { System.out.println("WashingMachine operating"); }
    public void clean() { System.out.println("WashingMachine being cleaned"); }
    public void maintain() { System.out.println("WashingMachine being maintained"); }
    public void replace() { System.out.println("WashingMachine being replaced"); }
}