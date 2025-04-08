package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Peanut;
import com.xworkxz.inheritance2.superclass.Legumes;

public class Pepper {
    public void process(Legumes legumes) {
        legumes.color();
        legumes.kg();
        legumes.size();
        legumes.origin();
        legumes.price();

        if(legumes instanceof Peanut) {
            Peanut peanut = (Peanut)legumes;
            peanut.country();
        }
    }
}