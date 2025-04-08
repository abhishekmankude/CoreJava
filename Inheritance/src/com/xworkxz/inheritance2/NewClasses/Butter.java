package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Ketchup;
import com.xworkxz.inheritance2.superclass.Condiments;

public class Butter {
    public void spread(Condiments condiments) {
        condiments.color();
        condiments.kg();
        condiments.size();
        condiments.origin();
        condiments.price();

        if(condiments instanceof Ketchup) {
            Ketchup ketchup = (Ketchup)condiments;
            ketchup.country();
        }
    }
}