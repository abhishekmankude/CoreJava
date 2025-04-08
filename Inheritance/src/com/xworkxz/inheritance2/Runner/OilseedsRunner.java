package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Groundnut;
import com.xworkxz.inheritance2.subclass.SunflowerSeed;
import com.xworkxz.inheritance2.superclass.Oilseeds;

public class OilseedsRunner {
    public static void main(String[] args) {
        Oilseeds oilseeds = new Oilseeds();
        oilseeds.color();
        oilseeds.kg();
        oilseeds.size();
        oilseeds.origin();
        oilseeds.price();

        Oilseeds oilseeds1 = new SunflowerSeed();
        oilseeds1.color();
        oilseeds1.kg();
        oilseeds1.size();
        oilseeds1.origin();
        oilseeds1.price();

        SunflowerSeed sunflowerSeed = new SunflowerSeed();
        sunflowerSeed.color();
        sunflowerSeed.kg();
        sunflowerSeed.size();
        sunflowerSeed.origin();
        sunflowerSeed.price();  // Added Groundnut functionality
        Groundnut groundnut = new Groundnut();
        groundnut.properties(oilseeds);
        groundnut.properties(sunflowerSeed);
    }
}
