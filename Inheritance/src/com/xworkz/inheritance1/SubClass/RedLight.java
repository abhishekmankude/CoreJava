package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.TrafficLight;

public class RedLight extends TrafficLight {
    public RedLight()
    {
        System.out.println("Runnig Redlight in traffic light");
    }
@Override
public void color()
{
    System.out.println("color is runnig in Red Lightt");
}
}
