package com.xworkxz.inheritance2.Runner;


import com.xworkxz.inheritance2.subclass.Honey;
import com.xworkxz.inheritance2.superclass.Sweeteners;

public class SweetenersRunner {
    public static void main(String[] args) {
        Sweeteners sweeteners = new Sweeteners();
        sweeteners.color();
        sweeteners.kg();
        sweeteners.size();
        sweeteners.origin();
        sweeteners.price();

        Sweeteners sweeteners1 = new Honey();
        sweeteners1.color();
        sweeteners1.kg();
        sweeteners1.size();
        sweeteners1.origin();
        sweeteners1.price();

        Honey honey = new Honey();
        honey.color();
        honey.kg();
        honey.size();
        honey.origin();
        honey.price();
    }
}
