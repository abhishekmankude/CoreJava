package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Lily;
import com.xworkxz.inheritance2.subclass.Rose;
import com.xworkxz.inheritance2.superclass.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.grow();
        plant.photosynthesize();
        plant.absorbWater();
        plant.produceOxygen();
        plant.bloom();

        Plant plant1 = new Rose();
        plant1.grow();
        plant1.photosynthesize();
        plant1.absorbWater();
        plant1.produceOxygen();
        plant1.bloom();

        Rose rose = new Rose();
        rose.grow();
        rose.photosynthesize();
        rose.absorbWater();
        rose.produceOxygen();
        rose.bloom();   // Added Lily functionality
        Lily lily = new Lily();
        lily.characteristics(plant);
        lily.characteristics(rose);
    }
}