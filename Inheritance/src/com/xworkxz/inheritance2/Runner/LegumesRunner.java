package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Pepper;
import com.xworkxz.inheritance2.subclass.Peanut;
import com.xworkxz.inheritance2.superclass.Legumes;

public class LegumesRunner {
    public static void main(String[] args) {
        Legumes legumes = new Legumes();
        legumes.color();
        legumes.kg();
        legumes.size();
        legumes.origin();
        legumes.price();

        Legumes legumes1 = new Peanut();
        legumes1.color();
        legumes1.kg();
        legumes1.size();
        legumes1.origin();
        legumes1.price();

        Peanut peanut = new Peanut();
        peanut.color();
        peanut.kg();
        peanut.size();
        peanut.origin();
        peanut.price();
        //////////////////////////////
        Pepper pepper = new Pepper();
        pepper.process(legumes);
        pepper.process(peanut);
    }
}
