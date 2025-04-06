package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Roots;

public class Carrot extends Roots {
    public Carrot() { System.out.println("No argument constructor in Carrot"); }

@Override
public void color() { System.out.println("Color is running in Carrot"); }
    public void kg() { System.out.println("Kg is running in Carrot"); }
    public void size() { System.out.println("Size is running in Carrot"); }
    public void origin() { System.out.println("Origin is running in Carrot"); }
    public void price() { System.out.println("Price is running in Carrot"); }

}