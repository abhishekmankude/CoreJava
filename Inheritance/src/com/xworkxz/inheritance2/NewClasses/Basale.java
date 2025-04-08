package com.xworkxz.inheritance2.NewClasses;


import com.xworkxz.inheritance2.subclass.Basil;
import com.xworkxz.inheritance2.superclass.Herbs;

public class Basale {
    public void cultivate(Herbs herbs) {
        herbs.type();
        herbs.aroma();
        herbs.medicinalValue();
        herbs.origin();
        herbs.price();

        if(herbs instanceof Basil) {
            Basil basil = (Basil)herbs;
            basil.country();
        }
    }
}