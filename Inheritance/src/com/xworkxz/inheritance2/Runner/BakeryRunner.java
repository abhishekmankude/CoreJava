package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Bread;
import com.xworkxz.inheritance2.superclass.Bakery;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.type();
        bakery.sweetness();
        bakery.ingredients();
        bakery.origin();
        bakery.price();

        Bakery bakery1 = new Bread();
        bakery1.type();
        bakery1.sweetness();
        bakery1.ingredients();
        bakery1.origin();
        bakery1.price();

        Bread bread = new Bread();
        bread.type();
        bread.sweetness();
        bread.ingredients();
        bread.origin();
        bread.price();
    }
}