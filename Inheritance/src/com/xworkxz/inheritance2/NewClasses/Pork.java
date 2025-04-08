package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Chicken;
import com.xworkxz.inheritance2.superclass.Meat;

public class Pork {
    public void prepare(Meat meat) {
        meat.type();
        meat.weight();
        meat.freshness();
        meat.origin();
        meat.price();

        if(meat instanceof Chicken) {
            Chicken chicken = (Chicken)meat;
            chicken.country();
        }
    }
}