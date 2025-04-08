package com.xworkxz.inheritance2.Runner;


import com.xworkxz.inheritance2.NewClasses.Leatch;
import com.xworkxz.inheritance2.subclass.Peach;
import com.xworkxz.inheritance2.superclass.StoneFruits;

public class StoneFruitsRunner {
    public static void main(String[] args) {
        StoneFruits fruits = new StoneFruits();
        fruits.color();
        fruits.kg();
        fruits.size();
        fruits.origin();
        fruits.price();

        StoneFruits fruits1 = new Peach();
        fruits1.color();
        fruits1.kg();
        fruits1.size();
        fruits1.origin();
        fruits1.price();

        Peach peach = new Peach();
        peach.color();
        peach.kg();
        peach.size();
        peach.origin();
        peach.price();   Leatch leatch = new Leatch();
        leatch.process(fruits);
        leatch.process(peach);
    }
}
