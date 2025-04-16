package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Oreo;
import com.xworkz.interfaceClass.internal.Dance;
import com.xworkz.interfaceClass.internal.Fan;
import com.xworkz.interfaceClass.internal.School;
import com.xworkz.interfaceClass.internal.Teacher;

public class Mug implements Oreo, Dance, Fan, School, Teacher {

    @Override
    public void open() {
        System.out.println("Mug is opening the Oreo packet.");
    }

    @Override
    public void eat() {
        System.out.println("Mug is eating the Oreo cookie.");
    }

    @Override
    public void share() {
        System.out.println("Mug is sharing the Oreo with friends.");
    }

    @Override
    public void perform() {
        System.out.println("Mug is performing a dance.");
    }

    @Override
    public void practice() {
        System.out.println("Mug is practicing daily.");
    }

    @Override
    public void choreograph() {
        System.out.println("Mug is choreographing a performance.");
    }

    @Override
    public void turnOn() {
        System.out.println("Mug is turning on the fan.");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Mug is adjusting fan speed.");
    }

    @Override
    public void turnOff() {
        System.out.println("Mug is turning off the fan.");
    }

    @Override
    public void conductClasses() {
        System.out.println("Mug is conducting school classes.");
    }

    @Override
    public void organizeExams() {
        System.out.println("Mug is organizing school exams.");
    }

    @Override
    public void holdEvents() {
        System.out.println("Mug is holding school events.");
    }

    @Override
    public void teach() {
        System.out.println("Mug is teaching students.");
    }

    @Override
    public void gradePapers() {
        System.out.println("Mug is grading student papers.");
    }

    @Override
    public void holdMeeting() {
        System.out.println("Mug is holding a teacher meeting.");
    }
}
