package com.xworkxz.inheritance2.NewClasses;


import com.xworkxz.inheritance2.subclass.Milk;
import com.xworkxz.inheritance2.superclass.Dairy;

public class Curd {
    public void make(Dairy dairy) {
        dairy.fatContent();
        dairy.liters();
        dairy.expiryDate();
        dairy.brand();
        dairy.price();

        if(dairy instanceof Milk) {
            Milk milk = (Milk)dairy;
            milk.country();
        }
    }
}