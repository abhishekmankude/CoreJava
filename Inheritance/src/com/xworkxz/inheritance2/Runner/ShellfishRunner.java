package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Loco;
import com.xworkxz.inheritance2.subclass.Lobster;
import com.xworkxz.inheritance2.superclass.Shellfish;

public class ShellfishRunner {
    public static void main(String[] args) {
        Shellfish shellfish = new Shellfish();
        shellfish.color();
        shellfish.kg();
        shellfish.size();
        shellfish.origin();
        shellfish.price();

        Shellfish shellfish1 = new Lobster();
        shellfish1.color();
        shellfish1.kg();
        shellfish1.size();
        shellfish1.origin();
        shellfish1.price();

        Lobster lobster = new Lobster();
        lobster.color();
        lobster.kg();
        lobster.size();
        lobster.origin();
        lobster.price();
        Loco loco = new Loco();
        loco.crustacean(shellfish);
        loco.crustacean(lobster);
    }
}
