package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Pineapple;
import com.xworkxz.inheritance2.subclass.Orange;
import com.xworkxz.inheritance2.superclass.CitrusFruits;

public class CitrusFruitsRunner {
    public static void main(String[] args) {
        CitrusFruits citrus = new CitrusFruits();
        citrus.color();
        citrus.kg();
        citrus.size();
        citrus.origin();
        citrus.price();

        CitrusFruits citrus1 = new Orange();
        citrus1.color();
        citrus1.kg();
        citrus1.size();
        citrus1.origin();
        citrus1.price();

        Orange orange = new Orange();
        orange.color();
        orange.kg();
        orange.size();
        orange.origin();
        orange.price();

        Pineapple pineapple=new Pineapple();
        pineapple.range(citrus);
        pineapple.range(orange);

    }
}
