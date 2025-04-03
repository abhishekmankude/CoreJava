package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Doll;
import com.xworkxz.inheritance2.superclass.Toy;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.playWith();
        toy.putAway();
        toy.clean();
        toy.assemble();
        toy.giftWrap();

        Toy toy1 = new Doll();
        toy1.playWith();
        toy1.putAway();
        toy1.clean();
        toy1.assemble();
        toy1.giftWrap();

        Doll doll = new Doll();
        doll.playWith();
        doll.putAway();
        doll.clean();
        doll.assemble();
        doll.giftWrap();
    }
}