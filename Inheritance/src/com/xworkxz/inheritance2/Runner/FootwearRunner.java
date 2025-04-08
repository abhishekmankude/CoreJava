package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Sandles;
import com.xworkxz.inheritance2.subclass.Sneakers;
import com.xworkxz.inheritance2.superclass.Footwear;

public class FootwearRunner {
    public static void main(String[] args) {
        Footwear footwear = new Footwear();
        footwear.wear();
        footwear.clean();
        footwear.polish();
        footwear.lace();
        footwear.store();

        Footwear footwear1 = new Sneakers();
        footwear1.wear();
        footwear1.clean();
        footwear1.polish();
        footwear1.lace();
        footwear1.store();

        Sneakers sneakers = new Sneakers();
        sneakers.wear();
        sneakers.clean();
        sneakers.polish();
        sneakers.lace();
        sneakers.store();


        //////////////////////////////
        Sandles sandles = new Sandles();
        sandles.use(footwear);
        sandles.use(sneakers);
    }
}