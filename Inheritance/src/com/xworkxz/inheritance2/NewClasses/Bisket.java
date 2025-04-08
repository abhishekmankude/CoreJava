package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Bread;
import com.xworkxz.inheritance2.superclass.Bakery;

public class Bisket {
    public void range(Bakery bakery) {
    bakery.ingredients();
    bakery.price();
    bakery.type();
    bakery.origin();
    bakery.sweetness();

    if(bakery instanceof Bread)
    {
        Bread bread=(Bread)bakery;
        bread.country();

    }

    }
}
