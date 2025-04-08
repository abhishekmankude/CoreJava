package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Football;
import com.xworkxz.inheritance2.superclass.SportsEquipment;

public class Bat {
    public void play(SportsEquipment equipment) {
        equipment.use();
        equipment.store();
        equipment.clean();
        equipment.repair();
        equipment.upgrade();

        if(equipment instanceof Football) {
            Football football = (Football)equipment;
            football.country();
        }
    }
}