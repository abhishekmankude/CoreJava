package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Kadike;
import com.xworkxz.inheritance2.subclass.Spinach;
import com.xworkxz.inheritance2.superclass.LeafyGreens;

public class LeafyGreensRunner {
    public static void main(String[] args) {
        LeafyGreens greens = new LeafyGreens();
        greens.color();
        greens.kg();
        greens.size();
        greens.origin();
        greens.price();

        LeafyGreens greens1 = new Spinach();
        greens1.color();
        greens1.kg();
        greens1.size();
        greens1.origin();
        greens1.price();

        Spinach spinach = new Spinach();
        spinach.color();
        spinach.kg();
        spinach.size();
        spinach.origin();
        spinach.price();

        //////////////////////////////
        Kadike kadike = new Kadike();
        kadike.prepare(greens);
        kadike.prepare(spinach);
    }
}
