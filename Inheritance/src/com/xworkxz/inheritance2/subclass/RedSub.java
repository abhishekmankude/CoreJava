package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Red;

public class RedSub extends Red {
    public RedSub(){
        System.out.println("no arg const RedSub");
    }
    @Override
    public void color()
    {
        System.out.println("Color is running in RedSub");
    }
    public void kg()
    {
        System.out.println("kg is running in RedSub");
    }
    public void size()
    {
        System.out.println("size is running in RedSub");
    }
    public void origin()
    {
        System.out.println("origin is running in RedSub");
    }
    public void price()
    {
        System.out.println("price is running in RedSub");
    }
}
