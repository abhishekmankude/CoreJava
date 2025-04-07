package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Watermelon;
import com.xworkxz.inheritance2.superclass.Melons;

public class Limbu {
    public void taste(Melons melons)
    {
        melons.kg();
        melons.color();
        melons.size();
        melons.origin();
        melons.price();

        if(melons instanceof Watermelon)
        {
            Watermelon watermelon=(Watermelon) melons;
            watermelon.rate();

        }
    }
}
