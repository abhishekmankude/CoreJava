package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.SunflowerSeed;
import com.xworkxz.inheritance2.superclass.Oilseeds;

public class Groundnut {
    public void properties(Oilseeds oilseeds) {
        oilseeds.color();
        oilseeds.kg();
        oilseeds.size();
        oilseeds.origin();
        oilseeds.price();

        if(oilseeds instanceof SunflowerSeed) {
            SunflowerSeed sunflowerSeed = (SunflowerSeed)oilseeds;
            sunflowerSeed.country();
        }
    }
}