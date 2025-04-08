package com.xworkxz.inheritance2.NewClasses;


import com.xworkxz.inheritance2.subclass.ChiaSeed;
import com.xworkxz.inheritance2.superclass.EdibleSeeds;

public class CoffeeSeeds {
    public void roast(EdibleSeeds seeds) {
        seeds.color();
        seeds.kg();
        seeds.size();
        seeds.origin();
        seeds.price();

        if(seeds instanceof ChiaSeed) {
            ChiaSeed chiaSeed = (ChiaSeed)seeds;
            chiaSeed.country();
        }
    }
}
