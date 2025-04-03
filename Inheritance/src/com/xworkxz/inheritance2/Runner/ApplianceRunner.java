package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Refrigerator;
import com.xworkxz.inheritance2.superclass.Appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.plugIn();
        appliance.unplug();
        appliance.operate();
        appliance.maintain();
        appliance.repair();

        Appliance appliance1 = new Refrigerator();
        appliance1.plugIn();
        appliance1.unplug();
        appliance1.operate();
        appliance1.maintain();
        appliance1.repair();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.plugIn();
        refrigerator.unplug();
        refrigerator.operate();
        refrigerator.maintain();
        refrigerator.repair();
    }
}