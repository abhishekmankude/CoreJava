package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Rose;
import com.xworkxz.inheritance2.superclass.Plant;

public class Lily {
    public void characteristics(Plant plant) {
        plant.grow();
        plant.photosynthesize();
        plant.absorbWater();
        plant.produceOxygen();
        plant.bloom();

        if(plant instanceof Rose) {
            Rose rose = (Rose)plant;
            rose.country();
        }
    }
}