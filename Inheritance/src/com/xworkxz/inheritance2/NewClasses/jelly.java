package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Salmon;
import com.xworkxz.inheritance2.superclass.Seafood;

public class jelly {
    public void fish(Seafood seafood) {
        seafood.species();
        seafood.weight();
        seafood.freshness();
        seafood.origin();
        seafood.price();

        if(seafood instanceof Salmon) {
            Salmon salmon = (Salmon)seafood;
            salmon.country();
        }
    }
}