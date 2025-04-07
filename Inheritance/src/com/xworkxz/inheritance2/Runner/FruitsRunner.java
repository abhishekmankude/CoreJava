package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.JackFruit;
import com.xworkxz.inheritance2.subclass.Apple;
import com.xworkxz.inheritance2.superclass.Fruits;

public class FruitsRunner {
    public static void main(String[] args) {
        Fruits fruits=new Fruits();
        fruits.kg();
        fruits.color();
        fruits.origin();
        fruits.size();
        fruits.price();

        Fruits fruits1=new Apple();
        fruits1.kg();
        fruits1.color();
        fruits1.origin();
        fruits1.size();
        fruits1.price();

        Apple apple=new Apple();
        apple.kg();
        apple.color();
        apple.origin();
        apple.size();
        apple.price();

        JackFruit jackFruit=new JackFruit();
        jackFruit.range(fruits);
        jackFruit.range(apple);

    }
}
