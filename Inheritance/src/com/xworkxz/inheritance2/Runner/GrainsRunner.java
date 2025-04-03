package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Rice;
import com.xworkxz.inheritance2.superclass.Grains;

public class GrainsRunner {
    public static void main(String[] args) {
        Grains grains = new Grains();
        grains.type();
        grains.weight();
        grains.nutritionalValue();
        grains.origin();
        grains.price();

        Grains grains1 = new Rice();
        grains1.type();
        grains1.weight();
        grains1.nutritionalValue();
        grains1.origin();
        grains1.price();

        Rice rice = new Rice();
        rice.type();
        rice.weight();
        rice.nutritionalValue();
        rice.origin();
        rice.price();
    }
}