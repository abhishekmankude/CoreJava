package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Toy;

public class Doll extends Toy {
    public Doll() { System.out.println("Doll constructor"); }


@Override
public void playWith() { System.out.println("Doll being played with"); }
    public void putAway() { System.out.println("Doll being put away"); }
    public void clean() { System.out.println("Doll being cleaned"); }
    public void assemble() { System.out.println("Doll being assembled"); }
    public void giftWrap() { System.out.println("Doll being gift-wrapped"); }
    public void country(){
        System.out.println("Country is Running");
    }}