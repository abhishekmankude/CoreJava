package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Chicken;
import com.xworkxz.inheritance2.superclass.Meat;

public class MeatRunner {
    public static void main(String[] args) {
        Meat meat = new Meat();
        meat.type();
        meat.weight();
        meat.freshness();
        meat.origin();
        meat.price();

        Meat meat1 = new Chicken();
        meat1.type();
        meat1.weight();
        meat1.freshness();
        meat1.origin();
        meat1.price();

        Chicken chicken = new Chicken();
        chicken.type();
        chicken.weight();
        chicken.freshness();
        chicken.origin();
        chicken.price();
    }
}