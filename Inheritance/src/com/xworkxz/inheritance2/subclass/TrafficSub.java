package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Traffic;

public class TrafficSub extends Traffic
{
    public TrafficSub()
    {
        System.out.println(" no arg const TrafficSub ");
    }
@Override
public void color()
{
    System.out.println("Color is running in TrafficSub");
}
    public void kg()
    {
        System.out.println("kg is running in TrafficSub");
    }
    public void size()
    {
        System.out.println("size is running in TrafficSub");
    }
    public void origin()
    {
        System.out.println("origin is running in TrafficSub");
    }
    public void price()
    {
        System.out.println("price is running in TrafficSub");
    }
}
