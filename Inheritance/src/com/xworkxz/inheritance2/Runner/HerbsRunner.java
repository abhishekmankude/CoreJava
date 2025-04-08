package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Basale;
import com.xworkxz.inheritance2.subclass.Basil;
import com.xworkxz.inheritance2.superclass.Herbs;

public class HerbsRunner {
    public static void main(String[] args) {
        Herbs herbs = new Herbs();
        herbs.type();
        herbs.aroma();
        herbs.medicinalValue();
        herbs.origin();
        herbs.price();

        Herbs herbs1 = new Basil();
        herbs1.type();
        herbs1.aroma();
        herbs1.medicinalValue();
        herbs1.origin();
        herbs1.price();

        Basil basil = new Basil();
        basil.type();
        basil.aroma();
        basil.medicinalValue();
        basil.origin();
        basil.price();

        //////////////////////////////
        Basale basale = new Basale();
        basale.cultivate(herbs);
        basale.cultivate(basil);
    }
}