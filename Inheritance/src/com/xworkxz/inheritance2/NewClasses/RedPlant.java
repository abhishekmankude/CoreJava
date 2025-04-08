package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.RedSub;
import com.xworkxz.inheritance2.superclass.Red;

public class RedPlant {
    public void grow(Red red) {
        red.color();
        red.kg();
        red.size();
        red.origin();
        red.price();

        if(red instanceof RedSub) {
            RedSub redSub = (RedSub)red;
            redSub.country();
        }
    }
}