package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Potato;
import com.xworkxz.inheritance2.superclass.Tubers;

public class Chilli {
    public void prepare(Tubers tubers) {
        tubers.color();
        tubers.kg();
        tubers.size();
        tubers.origin();
        tubers.price();

        if(tubers instanceof Potato) {
            Potato potato = (Potato)tubers;
            potato.country();
        }
    }
}