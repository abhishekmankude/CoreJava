package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.WashingMachine;
import com.xworkxz.inheritance2.superclass.HomeAppliance;

public class HomeApplianceRunner {
    public static void main(String[] args) {
        HomeAppliance appliance = new HomeAppliance();
        appliance.install();
        appliance.operate();
        appliance.clean();
        appliance.maintain();
        appliance.replace();

        HomeAppliance appliance1 = new WashingMachine();
        appliance1.install();
        appliance1.operate();
        appliance1.clean();
        appliance1.maintain();
        appliance1.replace();

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.install();
        washingMachine.operate();
        washingMachine.clean();
        washingMachine.maintain();
        washingMachine.replace();
    }
}