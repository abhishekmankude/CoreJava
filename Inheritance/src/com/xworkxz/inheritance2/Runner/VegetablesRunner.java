package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Apple;
import com.xworkxz.inheritance2.subclass.Tomato;
import com.xworkxz.inheritance2.superclass.Fruits;
import com.xworkxz.inheritance2.superclass.Vegetables;

public class VegetablesRunner {
    public static void main(String[] args) {
        Vegetables vegetables=new Vegetables();
        vegetables.kg();
        vegetables.color();
        vegetables.origin();
        vegetables.size();
        vegetables.price();

        Vegetables vegetables1=new Tomato();
        vegetables1.kg();
        vegetables1.color();
        vegetables1.origin();
        vegetables1.size();
        vegetables1.price();

        Tomato tomato=new Tomato();
        tomato.kg();
        tomato.color();
        tomato.origin();
        tomato.size();
        tomato.price();
    }
}
