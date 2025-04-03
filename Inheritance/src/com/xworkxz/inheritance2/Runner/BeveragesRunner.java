package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Coffee;
import com.xworkxz.inheritance2.superclass.Beverages;

public class BeveragesRunner {
    public static void main(String[] args) {
        Beverages beverages = new Beverages();
        beverages.temperature();
        beverages.volume();
        beverages.brand();
        beverages.ingredients();
        beverages.price();

        Beverages beverages1 = new Coffee();
        beverages1.temperature();
        beverages1.volume();
        beverages1.brand();
        beverages1.ingredients();
        beverages1.price();

        Coffee coffee = new Coffee();
        coffee.temperature();
        coffee.volume();
        coffee.brand();
        coffee.ingredients();
        coffee.price();
    }
}