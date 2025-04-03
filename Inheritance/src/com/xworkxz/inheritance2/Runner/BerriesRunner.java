package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Strawberry;
import com.xworkxz.inheritance2.superclass.Berries;

public class BerriesRunner {
    public static void main(String[] args) {
        Berries berries = new Berries();
        berries.color();
        berries.kg();
        berries.size();
        berries.origin();
        berries.price();

        Berries berries1 = new Strawberry();
        berries1.color();
        berries1.kg();
        berries1.size();
        berries1.origin();
        berries1.price();

        Strawberry strawberry = new Strawberry();
        strawberry.color();
        strawberry.kg();
        strawberry.size();
        strawberry.origin();
        strawberry.price();
    }
}
