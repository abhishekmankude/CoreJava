package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Apple;
import com.xworkxz.inheritance2.superclass.Fruits;

public class Mango {
    public void range(Fruits fruits) {
        fruits.kg();
        fruits.color();
        fruits.origin();
        fruits.size();
        fruits.price();

        if(fruits instanceof Apple) {
            Apple apple = (Apple)fruits;
            apple.country();
        }
    }
}