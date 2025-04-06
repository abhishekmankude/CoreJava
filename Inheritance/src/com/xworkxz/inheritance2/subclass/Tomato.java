package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Fruits;
import com.xworkxz.inheritance2.superclass.Vegetables;

public class Tomato extends Vegetables {
    public Tomato()
    {
        System.out.println("No arguement constructor in Tomato");
    }
    @Override
    public void color()
    {
        System.out.println("Color is running in Tomato");
    }
    public void kg()
    {
        System.out.println("kg is running in Tomato");
    }
    public void size()
    {
        System.out.println("size is running in Tomato");
    }
    public void origin()
    {
        System.out.println("origin is running in Tomato");
    }
    public void price()
    {
        System.out.println("price is running in Tomato");
    }


}