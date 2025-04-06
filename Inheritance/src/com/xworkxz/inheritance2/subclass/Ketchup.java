package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Condiments;

public class Ketchup extends Condiments { public Ketchup() { System.out.println("No argument constructor in Ketchup"); }
@Override
public void color() { System.out.println("Color is running in Ketchup"); }
    public void kg() { System.out.println("kg is running in Ketchup"); }
    public void size() { System.out.println("size is running in Ketchup"); }
    public void origin() { System.out.println("origin is running in Ketchup"); }
    public void price() { System.out.println("price is running in Ketchup"); }
}
