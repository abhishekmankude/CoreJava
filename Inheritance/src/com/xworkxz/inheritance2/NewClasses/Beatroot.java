package com.xworkxz.inheritance2.NewClasses;


import com.xworkxz.inheritance2.subclass.Carrot;
import com.xworkxz.inheritance2.superclass.Roots;

public class Beatroot {
    public void juice(Roots roots) {
        roots.color();
        roots.kg();
        roots.size();
        roots.origin();
        roots.price();

        if(roots instanceof Carrot) {
            Carrot carrot = (Carrot)roots;
            carrot.country();
        }
    }
}