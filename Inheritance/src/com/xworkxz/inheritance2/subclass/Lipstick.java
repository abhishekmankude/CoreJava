package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Cosmetics;

public class Lipstick extends Cosmetics {
    public Lipstick() { System.out.println("Lipstick constructor"); }

@Override
public void apply() { System.out.println("Lipstick being applied"); }
    public void remove() { System.out.println("Lipstick being removed"); }
    public void purchase() { System.out.println("Lipstick being purchased"); }
    public void store() { System.out.println("Lipstick being stored"); }
    public void checkExpiry() { System.out.println("Lipstick expiry being checked"); }
}