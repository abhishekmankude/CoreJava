package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Home;
import com.xworkz.interfaceClass.internal.Monkey;

public class Eyeliner implements Home, Monkey {
    @Override
    public void clean() {
        System.out.println("Cleaning the house");
    }

    @Override
    public void cook() {
        System.out.println("Cooking a delicious meal");
    }

    @Override
    public void organize() {
        System.out.println("Organizing the home for a better living space");
    }
    @Override
    public void climb() {
        System.out.println("Monkey is climbing the tree");
    }

    @Override
    public void swing() {
        System.out.println("Monkey is swinging from one branch to another");
    }

    @Override
    public void eatBanana() {
        System.out.println("Monkey is eating a banana");
    }
}
