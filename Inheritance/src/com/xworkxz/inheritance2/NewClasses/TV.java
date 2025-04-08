package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.WashingMachine;
import com.xworkxz.inheritance2.superclass.HomeAppliance;

public class TV {
    public void use(HomeAppliance appliance) {
        appliance.install();
        appliance.operate();
        appliance.clean();
        appliance.maintain();
        appliance.replace();

        if(appliance instanceof WashingMachine) {
            WashingMachine washingMachine = (WashingMachine)appliance;
            washingMachine.country();
        }
    }
}