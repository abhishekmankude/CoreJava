package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Fruits;

public class Apple extends Fruits {
    public Apple()
    {
        System.out.println("No arguement constructor in Apple");
    }
@Override
    public void color()
    {
        System.out.println("Color is running in Apple");
    }
    public void kg()
    {
        System.out.println("kg is running in Apple");
    }
    public void size()
    {
        System.out.println("size is running in Apple");
    }
    public void origin()
    {
        System.out.println("origin is running in Apple");
    }
    public void price()
    {
        System.out.println("price is running in Apple");
    }
}
