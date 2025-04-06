package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Jewelry;

public class Necklace extends Jewelry {
    public Necklace() { System.out.println("Necklace constructor"); }

@Override
public void wear() { System.out.println("Necklace being worn"); }
    public void polish() { System.out.println("Necklace being polished"); }
    public void clean() { System.out.println("Necklace being cleaned"); }
    public void store() { System.out.println("Necklace being stored"); }
    public void appraise() { System.out.println("Necklace being appraised"); }
}