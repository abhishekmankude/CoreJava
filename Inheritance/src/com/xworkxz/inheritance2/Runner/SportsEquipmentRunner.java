package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Football;
import com.xworkxz.inheritance2.superclass.SportsEquipment;

public class SportsEquipmentRunner {
    public static void main(String[] args) {
        SportsEquipment equipment = new SportsEquipment();
        equipment.use();
        equipment.store();
        equipment.clean();
        equipment.repair();
        equipment.upgrade();

        SportsEquipment equipment1 = new Football();
        equipment1.use();
        equipment1.store();
        equipment1.clean();
        equipment1.repair();
        equipment1.upgrade();

        Football football = new Football();
        football.use();
        football.store();
        football.clean();
        football.repair();
        football.upgrade();
    }
}