package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Limbu;
import com.xworkxz.inheritance2.subclass.Watermelon;
import com.xworkxz.inheritance2.superclass.Melons;

public class MelonsRunner {
    public static void main(String[] args) {
        Melons melons = new Melons();
        melons.color();
        melons.kg();
        melons.size();
        melons.origin();
        melons.price();

        Melons melons1 = new Watermelon();
        melons1.color();
        melons1.kg();
        melons1.size();
        melons1.origin();
        melons1.price();

        Watermelon watermelon = new Watermelon();
        watermelon.color();
        watermelon.kg();
        watermelon.size();
        watermelon.origin();
        watermelon.price();




        Limbu limbu=new Limbu();
        limbu.taste(melons);
        limbu.taste(watermelon);





    }
}
