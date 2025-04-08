package com.xworkxz.inheritance2.Runner;


import com.xworkxz.inheritance2.NewClasses.Chilli;
import com.xworkxz.inheritance2.subclass.Potato;
import com.xworkxz.inheritance2.superclass.Tubers;

public class TubersRunner {
    public static void main(String[] args) {
        Tubers tubers = new Tubers();
        tubers.color();
        tubers.kg();
        tubers.size();
        tubers.origin();
        tubers.price();

        Tubers tubers1 = new Potato();
        tubers1.color();
        tubers1.kg();
        tubers1.size();
        tubers1.origin();
        tubers1.price();

        Potato potato = new Potato();
        potato.color();
        potato.kg();
        potato.size();
        potato.origin();
        potato.price();   Chilli chilli = new Chilli();
        chilli.prepare(tubers);
        chilli.prepare(potato);
    }
}
