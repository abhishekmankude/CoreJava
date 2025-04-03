package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.ChiaSeed;
import com.xworkxz.inheritance2.superclass.EdibleSeeds;

class EdibleSeedsRunner {
    public static void main(String[] args) {
        EdibleSeeds seeds = new EdibleSeeds();
        seeds.color();
        seeds.kg();
        seeds.size();
        seeds.origin();
        seeds.price();

        EdibleSeeds seeds1 = new ChiaSeed();
        seeds1.color();
        seeds1.kg();
        seeds1.size();
        seeds1.origin();
        seeds1.price();

        ChiaSeed chiaSeed = new ChiaSeed();
        chiaSeed.color();
        chiaSeed.kg();
        chiaSeed.size();
        chiaSeed.origin();
        chiaSeed.price();
    }
}
