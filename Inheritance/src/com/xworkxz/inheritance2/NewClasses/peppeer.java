package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Cinnamon;
import com.xworkxz.inheritance2.superclass.Spices;

public class peppeer {
    public void grind(Spices spices) {
        spices.type();
        spices.aroma();
        spices.heatLevel();
        spices.origin();
        spices.price();

        if(spices instanceof Cinnamon) {
            Cinnamon cinnamon = (Cinnamon)spices;
            cinnamon.country();
        }
    }
}