package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Shirt;
import com.xworkxz.inheritance2.superclass.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.wear();
        clothing.wash();
        clothing.dry();
        clothing.iron();
        clothing.fold();

        Clothing clothing1 = new Shirt();
        clothing1.wear();
        clothing1.wash();
        clothing1.dry();
        clothing1.iron();
        clothing1.fold();

        Shirt shirt = new Shirt();
        shirt.wear();
        shirt.wash();
        shirt.dry();
        shirt.iron();
        shirt.fold();
    }
}