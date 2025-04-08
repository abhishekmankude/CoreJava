package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Sneakers;
import com.xworkxz.inheritance2.superclass.Footwear;

public class Sandles {
    public void use(Footwear footwear) {
        footwear.wear();
        footwear.clean();
        footwear.polish();
        footwear.lace();
        footwear.store();

        if(footwear instanceof Sneakers) {
            Sneakers sneakers = (Sneakers)footwear;
            sneakers.country();
        }
    }
}