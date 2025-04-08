package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.RedPlant;
import com.xworkxz.inheritance2.subclass.RedSub;
import com.xworkxz.inheritance2.superclass.Red;

public class RedRunner {
    public static void main(String[] args) {
        Red red=new Red();
        red.kg();
        red.color();
        red.origin();
        red.price();
        red.size();

        RedSub redSub=new RedSub();
        redSub.kg();
        redSub.color();
        redSub.origin();
        redSub.price();
        redSub.size();

        Red red1=new RedSub();
        red1.kg();
        red1.color();
        red1.origin();
        red1.price();
        red1.size();

        RedPlant redPlant = new RedPlant();
        redPlant.grow(red);
        redPlant.grow(redSub);
    }
}
