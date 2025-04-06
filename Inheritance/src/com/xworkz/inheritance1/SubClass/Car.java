package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Vehicle;

public class Car extends Vehicle
{
    public Car(){
        System.out.println("Car is running in car ");
    }
    public void engine() {
        System.out.println("engine() is running in Car");
    }

    public void wheels() {
        System.out.println("wheels() is running in Car");
    }

    public void color() {
        System.out.println("color() is running in Car");
    }

    public void brand() {
        System.out.println("brand() is running in Car");
    }

    public void price() {
        System.out.println("price() is running in Car");
    }
}
