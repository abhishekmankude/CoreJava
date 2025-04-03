package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Milk;
import com.xworkxz.inheritance2.superclass.Dairy;

public class DairyRunner {
    public static void main(String[] args) {
        Dairy dairy = new Dairy();
        dairy.fatContent();
        dairy.liters();
        dairy.expiryDate();
        dairy.brand();
        dairy.price();

        Dairy dairy1 = new Milk();
        dairy1.fatContent();
        dairy1.liters();
        dairy1.expiryDate();
        dairy1.brand();
        dairy1.price();

        Milk milk = new Milk();
        milk.fatContent();
        milk.liters();
        milk.expiryDate();
        milk.brand();
        milk.price();
    }
}
