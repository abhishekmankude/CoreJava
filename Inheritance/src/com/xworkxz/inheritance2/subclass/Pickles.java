package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.PickledFoods;

public class Pickles extends PickledFoods { public Pickles() { System.out.println("No argument constructor in Pickles"); }
@Override
public void color() { System.out.println("Color is running in Pickles Foods"); }
    public void kg() { System.out.println("kg is running in Pickles Foods"); }
    public void size() { System.out.println("size is running in Pickles Foods"); }
    public void origin() { System.out.println("origin is running in Pickles Foods"); }
    public void price() { System.out.println("price is running in Pickles Foods"); }
}
