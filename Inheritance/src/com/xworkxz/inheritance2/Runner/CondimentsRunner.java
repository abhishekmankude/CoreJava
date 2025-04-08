package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Butter;
import com.xworkxz.inheritance2.subclass.Ketchup;
import com.xworkxz.inheritance2.superclass.Condiments;

public class CondimentsRunner {
    public static void main(String[] args) {
        Condiments condiments = new Condiments();
        condiments.color();
        condiments.kg();
        condiments.size();
        condiments.origin();
        condiments.price();

        Condiments condiments1 = new Ketchup();
        condiments1.color();
        condiments1.kg();
        condiments1.size();
        condiments1.origin();
        condiments1.price();

        Ketchup ketchup = new Ketchup();
        ketchup.color();
        ketchup.kg();
        ketchup.size();
        ketchup.origin();
        ketchup.price();
        //////////////////////////////
        Butter butter = new Butter();
        butter.spread(condiments);
        butter.spread(ketchup);
    }
}
