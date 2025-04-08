package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Lobster;
import com.xworkxz.inheritance2.superclass.Shellfish;

public class Loco {
    public void crustacean(Shellfish shellfish) {
        shellfish.color();
        shellfish.kg();
        shellfish.size();
        shellfish.origin();
        shellfish.price();

        if(shellfish instanceof Lobster) {
            Lobster lobster = (Lobster)shellfish;
            lobster.country();
        }
    }
}
