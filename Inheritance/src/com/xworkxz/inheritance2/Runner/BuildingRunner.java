package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Landscraper;
import com.xworkxz.inheritance2.subclass.Skyscraper;
import com.xworkxz.inheritance2.superclass.Building;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building();
        building.construct();
        building.demolish();
        building.paint();
        building.renovate();
        building.occupy();

        Building building1 = new Skyscraper();
        building1.construct();
        building1.demolish();
        building1.paint();
        building1.renovate();
        building1.occupy();

        Skyscraper skyscraper = new Skyscraper();
        skyscraper.construct();
        skyscraper.demolish();
        skyscraper.paint();
        skyscraper.renovate();
        skyscraper.occupy();

        Landscraper landscraper=new Landscraper();
        landscraper.range(building);
        landscraper.range(skyscraper);

    }
}