package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Cinnamon;
import com.xworkxz.inheritance2.superclass.Spices;

public class SpicesRunner {
    public static void main(String[] args) {
        Spices spices = new Spices();
        spices.type();
        spices.aroma();
        spices.heatLevel();
        spices.origin();
        spices.price();

        Spices spices1 = new Cinnamon();
        spices1.type();
        spices1.aroma();
        spices1.heatLevel();
        spices1.origin();
        spices1.price();

        Cinnamon cinnamon = new Cinnamon();
        cinnamon.type();
        cinnamon.aroma();
        cinnamon.heatLevel();
        cinnamon.origin();
        cinnamon.price();
    }
}