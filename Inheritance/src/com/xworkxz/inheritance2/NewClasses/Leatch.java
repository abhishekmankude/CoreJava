package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Peach;
import com.xworkxz.inheritance2.superclass.StoneFruits;

public class Leatch {
    public void process(StoneFruits fruits) {
        fruits.color();
        fruits.kg();
        fruits.size();
        fruits.origin();
        fruits.price();

        if(fruits instanceof Peach) {
            Peach peach = (Peach)fruits;
            peach.country();
        }
    }
}