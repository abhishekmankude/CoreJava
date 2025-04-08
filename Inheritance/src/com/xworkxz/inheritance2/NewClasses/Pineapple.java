package com.xworkxz.inheritance2.NewClasses;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xworkxz.inheritance2.subclass.Orange;
import com.xworkxz.inheritance2.superclass.CitrusFruits;

public class Pineapple {
    public void range(CitrusFruits citrusFruits) {
        citrusFruits.kg();
        citrusFruits.color();
        citrusFruits.origin();
        citrusFruits.size();
        citrusFruits.price();

        if( citrusFruits instanceof Orange)
        {
            Orange orange=(Orange)citrusFruits;
            orange.country();

        }
    }
}
