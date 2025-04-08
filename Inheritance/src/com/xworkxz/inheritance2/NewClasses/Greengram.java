package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Lentils;
import com.xworkxz.inheritance2.superclass.Pulses;

public class Greengram {
    public void properties(Pulses pulses) {
        pulses.type();
        pulses.proteinContent();
        pulses.weight();
        pulses.origin();
        pulses.price();

        if(pulses instanceof Lentils) {
            Lentils lentils = (Lentils)pulses;
            lentils.country();
        }
    }
}