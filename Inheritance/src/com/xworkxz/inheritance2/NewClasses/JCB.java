package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Doll;
import com.xworkxz.inheritance2.superclass.Toy;

public class JCB {
    public void interactWithToy(Toy toy) {
        toy.playWith();
        toy.putAway();
        toy.clean();
        toy.assemble();
        toy.giftWrap();

        if (toy instanceof Doll) {
            Doll doll = (Doll) toy;
            doll.country();
        }
        System.out.println("--------------------");
    }
}