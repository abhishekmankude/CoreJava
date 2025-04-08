package com.xworkxz.inheritance2.NewClasses;


import com.xworkxz.inheritance2.subclass.Honey;
import com.xworkxz.inheritance2.superclass.Sweeteners;

public class Ghee {
    public void checkSweetener(Sweeteners sweetener) {
        sweetener.color();
        sweetener.kg();
        sweetener.size();
        sweetener.origin();
        sweetener.price();

        if (sweetener instanceof Honey) {
            Honey honey = (Honey) sweetener;
            honey.country();
        }
        System.out.println("--------------------");
    }
}