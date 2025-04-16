package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Teacher;
import com.xworkz.interfaceClass.internal.TShirt;
import com.xworkz.interfaceClass.internal.Anklet;
import com.xworkz.interfaceClass.internal.Bed;
import com.xworkz.interfaceClass.internal.Frame;

public class Jug implements Teacher, TShirt, Anklet, Bed, Frame {

    @Override
    public void teach() {
        System.out.println("Pant is teaching a subject.");
    }

    @Override
    public void gradePapers() {
        System.out.println("Pant is grading papers.");
    }

    @Override
    public void holdMeeting() {
        System.out.println("Pant is holding a teacher meeting.");
    }

    @Override
    public void wear() {
        System.out.println("Pant is being worn like a TShirt or Anklet.");
    }

    @Override
    public void wash() {
        System.out.println("Pant is being washed.");
    }

    @Override
    public void fold() {
        System.out.println("Pant is being folded.");
    }

    @Override
    public void makeSound() {
        System.out.println("Pant anklet is making sound.");
    }

    @Override
    public void remove() {
        System.out.println("Pant anklet is removed.");
    }

    @Override
    public void layDown() {
        System.out.println("Pant is laid down on the bed.");
    }

    @Override
    public void make() {
        System.out.println("Pant is making the bed.");
    }

    @Override
    public void sleep() {
        System.out.println("Pant is sleeping on the bed.");
    }

    @Override
    public void design() {
        System.out.println("Pant frame is being designed.");
    }

    @Override
    public void assemble() {
        System.out.println("Pant frame is being assembled.");
    }

    @Override
    public void display() {
        System.out.println("Pant frame is on display.");
    }
}
