package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Lipstick;
import com.xworkxz.inheritance2.superclass.Cosmetics;

public class CosmeticsRunner {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.apply();
        cosmetics.remove();
        cosmetics.purchase();
        cosmetics.store();
        cosmetics.checkExpiry();

        Cosmetics cosmetics1 = new Lipstick();
        cosmetics1.apply();
        cosmetics1.remove();
        cosmetics1.purchase();
        cosmetics1.store();
        cosmetics1.checkExpiry();

        Lipstick lipstick = new Lipstick();
        lipstick.apply();
        lipstick.remove();
        lipstick.purchase();
        lipstick.store();
        lipstick.checkExpiry();
    }
}