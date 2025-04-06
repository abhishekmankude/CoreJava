package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.DriedFruits;

public class Raisin extends DriedFruits { public Raisin() { System.out.println("No argument constructor in Raisin"); }
@Override
public void color() { System.out.println("Color is running in Raisin Fruits"); }
    public void kg() { System.out.println("kg is running in Raisin Fruits"); }
    public void size() { System.out.println("size is running in Raisin Fruits"); }
    public void origin() { System.out.println("origin is running in Raisin Fruits"); }
    public void price() { System.out.println("price is running in Raisin Fruits"); }
}
