package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Almond;
import com.xworkxz.inheritance2.superclass.Nuts;

public class Ground {
    public void process(Nuts nuts) {
        nuts.type();
        nuts.crunchiness();
        nuts.nutritionalValue();
        nuts.origin();
        nuts.price();

        if(nuts instanceof Almond) {
            Almond almond = (Almond)nuts;
            almond.country();
        }
    }
}
