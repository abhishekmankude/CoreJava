package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.ButtonMushroom;
import com.xworkxz.inheritance2.superclass.Mushrooms;

public class MushroomsRunner {
    public static void main(String[] args) {
        Mushrooms mushrooms = new Mushrooms();
        mushrooms.color();
        mushrooms.kg();
        mushrooms.size();
        mushrooms.origin();
        mushrooms.price();

        Mushrooms mushrooms1 = new ButtonMushroom();
        mushrooms1.color();
        mushrooms1.kg();
        mushrooms1.size();
        mushrooms1.origin();
        mushrooms1.price();

        ButtonMushroom buttonMushroom = new ButtonMushroom();
        buttonMushroom.color();
        buttonMushroom.kg();
        buttonMushroom.size();
        buttonMushroom.origin();
        buttonMushroom.price();
    }
}
