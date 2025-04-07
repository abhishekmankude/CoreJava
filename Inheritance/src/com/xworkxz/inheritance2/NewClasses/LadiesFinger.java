package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Tomato;
import com.xworkxz.inheritance2.superclass.Vegetables;

public class LadiesFinger {
    public void range(Vegetables vegetables) {
    vegetables.kg();
    vegetables.color();
    vegetables.size();
    vegetables.price();
    vegetables.origin();

    if(vegetables instanceof Tomato)
    {
        Tomato tomato=(Tomato) vegetables;
        tomato.country();
    }

    }
}
