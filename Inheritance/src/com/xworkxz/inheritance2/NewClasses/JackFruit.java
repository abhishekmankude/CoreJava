package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.A;
import com.xworkxz.inheritance2.subclass.Apple;
import com.xworkxz.inheritance2.superclass.Fruits;

public class JackFruit {
    public void range(Fruits fruits)
    {

        fruits.price();
        fruits.size();
        fruits.kg();
        fruits.origin();
        fruits.color();


        if(fruits instanceof Apple)
        {
            Apple apple=(Apple) fruits;
            apple.country();

        }
    }
}
