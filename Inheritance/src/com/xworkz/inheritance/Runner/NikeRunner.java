package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.Local.Nike;
import com.xworkz.inheritance.Local.Shoe;

public class NikeRunner {
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

    }
}
