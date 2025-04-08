package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.jelly;
import com.xworkxz.inheritance2.superclass.Seafood;
import com.xworkxz.inheritance2.subclass.Salmon;

public class SeafoodRunner {
    public static void main(String[] args) {
        Seafood seafood = new Seafood();
        seafood.species();
        seafood.weight();
        seafood.freshness();
        seafood.origin();
        seafood.price();

        Seafood seafood1 = new Salmon();
        seafood1.species();
        seafood1.weight();
        seafood1.freshness();
        seafood1.origin();
        seafood1.price();

        Salmon salmon = new Salmon();
        salmon.species();
        salmon.weight();
        salmon.freshness();
        salmon.origin();
        salmon.price();
        jelly jelly = new jelly();
        jelly.fish(seafood);
        jelly.fish(salmon);
    }
}

