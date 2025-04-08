package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.ButtonMushroom;
import com.xworkxz.inheritance2.superclass.Mushrooms;

public class LongMushroom {
    public void cook(Mushrooms mushrooms) {
        mushrooms.color();
        mushrooms.kg();
        mushrooms.size();
        mushrooms.origin();
        mushrooms.price();

        if(mushrooms instanceof ButtonMushroom) {
            ButtonMushroom buttonMushroom = (ButtonMushroom)mushrooms;
            buttonMushroom.country();
        }
    }
}