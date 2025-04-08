package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Rice;
import com.xworkxz.inheritance2.superclass.Grains;

public class Wheat {
    public void process(Grains grains) {
        grains.type();
        grains.weight();
        grains.nutritionalValue();
        grains.origin();
        grains.price();

        if(grains instanceof Rice) {
            Rice rice = (Rice)grains;
            rice.country();
        }
    }
}