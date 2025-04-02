package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.SubClass.Adidas;
import com.xworkz.inheritance.SubClass.Nike;
import com.xworkz.inheritance.SuperClass.Shoe;

public class MainRunner {
    public static void main(String[] args) {
        Shoe shoe=new Shoe();
        shoe.color();
        shoe.brand();
        shoe.lase();
        shoe.price();
        shoe.sole();

        Nike nike=new Nike();
        nike.brand();
        nike.lase();
        nike.lase();
        nike.sole();
        nike.price();

        Shoe shoe1=new Nike();
        shoe1.sole();
        shoe1.price();
        shoe1.brand();
        shoe1.lase();
        shoe1.color();

        Adidas adidas=new Adidas();
        adidas.brand();
        adidas.lase();
        adidas.color();
        adidas.sole();
        adidas.price();

        Shoe shoe2=new Adidas();
        shoe2.brand();
        shoe2.lase();
        shoe2.color();
        shoe2.sole();
        shoe2.price();

    }
}
