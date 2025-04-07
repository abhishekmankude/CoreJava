package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Melons;

public class Watermelon extends Melons { public Watermelon() { System.out.println("No argument constructor in Watermelon"); }
@Override
public void color() { System.out.println("Color is running in Watermelon"); }
    public void kg() { System.out.println("kg is running in Watermelon"); }
    public void size() { System.out.println("size is running in Watermelon"); }
    public void origin() { System.out.println("origin is running in Watermelon"); }
    public void price() { System.out.println("price is running in Watermelon"); }

    public void rate()
    {
        System.out.println("rate is running in watermelon");
    }
}
