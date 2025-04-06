package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.TrafficLight;

public class GreenLight extends TrafficLight {
    public GreenLight()
    {
        System.out.println("Runnig Greenlight const in Greenlight");
    }

@Override
public void color()
{
    System.out.println("color is runnig in GreenLight");
}
}
