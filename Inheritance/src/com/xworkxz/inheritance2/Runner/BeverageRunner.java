package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Coffee;
import com.xworkxz.inheritance2.superclass.Beverage;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverage beverage = new Beverage();
        beverage.drink();
        beverage.pour();
        beverage.chill();
        beverage.store();
        beverage.serve();


    }
}