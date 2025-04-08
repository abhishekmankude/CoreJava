package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Strawberry;
import com.xworkxz.inheritance2.superclass.Berries;

public class BlueBerry {
    public void range(Berries berries) {
    berries.kg();
    berries.color();
    berries.size();
    berries.origin();
    berries.price();

    if(berries instanceof Strawberry)
    {
        Strawberry strawberry=(Strawberry) berries;
        strawberry.country();
    }

    }
}
