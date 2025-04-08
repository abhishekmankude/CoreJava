package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Spinach;
import com.xworkxz.inheritance2.superclass.LeafyGreens;

public class Kadike {
    public void prepare(LeafyGreens greens) {
        greens.color();
        greens.kg();
        greens.size();
        greens.origin();
        greens.price();

        if(greens instanceof Spinach) {
            Spinach spinach = (Spinach)greens;
            spinach.country();
        }
    }
}