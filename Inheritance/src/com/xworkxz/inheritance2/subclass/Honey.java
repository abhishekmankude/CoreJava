package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Sweeteners;

public class Honey extends Sweeteners { public Honey() { System.out.println("No argument constructor in Honey"); }
@Override
public void color() { System.out.println("Color is running in Honey"); }
    public void kg() { System.out.println("kg is running in Honey"); }
    public void size() { System.out.println("size is running in Honey"); }
    public void origin() { System.out.println("origin is running in Honey"); }
    public void price() { System.out.println("price is running in Honey"); }
}
