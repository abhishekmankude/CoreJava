package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Animal;

public class Dog extends Animal {
    public Dog() { System.out.println("Dog constructor"); }

@Override
    public void eat() { System.out.println("Dog Animal eating"); }
    public void sleep() { System.out.println(" Dog Animal sleeping"); }
    public void move() { System.out.println("Dog Animal moving"); }
    public void breathe() { System.out.println("Dog Animal breathing"); }
    public void reproduce() { System.out.println("Dog Animal reproducing"); }


    public void bark(){
        System.out.println("barking is running");
    }
}