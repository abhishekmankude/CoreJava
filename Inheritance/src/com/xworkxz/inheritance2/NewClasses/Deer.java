package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Dog;
import com.xworkxz.inheritance2.superclass.Animal;

public class Deer {
    public void horns(Animal animal)
    {
        animal.eat();
        animal.move();
        animal.sleep();
        animal.reproduce();
        animal.breathe();

        if(animal instanceof Dog)
        {
            Dog dog=(Dog)animal;
            dog.bark();

        }


    }
}
