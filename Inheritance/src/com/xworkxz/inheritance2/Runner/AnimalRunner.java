package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Deer;
import com.xworkxz.inheritance2.subclass.Dog;
import com.xworkxz.inheritance2.superclass.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.move();
        animal.breathe();
        animal.reproduce();

        Animal animal1 = new Dog();
        animal1.eat();
        animal1.sleep();
        animal1.move();
        animal1.breathe();
        animal1.reproduce();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.move();
        dog.breathe();
        dog.reproduce();
//////////////////////////////
        Deer deer=new Deer();
        deer.horns(animal);
        deer.horns(dog);



    }
}