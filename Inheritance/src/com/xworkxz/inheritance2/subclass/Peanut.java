package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Legumes;

public class Peanut extends Legumes { public Peanut() { System.out.println("No argument constructor in Peanut"); }
@Override
public void color() { System.out.println("Color is running in Peanut"); }
    public void kg() { System.out.println("kg is running in Peanut"); }
    public void size() { System.out.println("size is running in Peanut"); }
    public void origin() { System.out.println("origin is running in Peanut"); }
    public void price() { System.out.println("price is running in Peanut"); }
}
