package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Ground;
import com.xworkxz.inheritance2.subclass.Almond;
import com.xworkxz.inheritance2.superclass.Nuts;

public class NutsRunner {
    public static void main(String[] args) {
        Nuts nuts = new Nuts();
        nuts.type();
        nuts.crunchiness();
        nuts.nutritionalValue();
        nuts.origin();
        nuts.price();

        Nuts nuts1 = new Almond();
        nuts1.type();
        nuts1.crunchiness();
        nuts1.nutritionalValue();
        nuts1.origin();
        nuts1.price();

        Almond almond = new Almond();
        almond.type();
        almond.crunchiness();
        almond.nutritionalValue();
        almond.origin();
        almond.price();
        //////////////////////////////
        Ground ground = new Ground();
        ground.process(nuts);
        ground.process(almond);
    }
}