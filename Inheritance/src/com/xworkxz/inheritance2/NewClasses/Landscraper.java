package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Skyscraper;
import com.xworkxz.inheritance2.superclass.Building;

public class Landscraper {
    public void range(Building building) {
        building.construct();
        building.occupy();
        building.demolish();
        building.paint();
        building.renovate();


        if(building instanceof Skyscraper)
        {
            Skyscraper skyscraper=(Skyscraper) building;
            ((Skyscraper) building).country();

        }
    }
}
