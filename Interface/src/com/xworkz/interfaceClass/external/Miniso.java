package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barber;
import com.xworkz.interfaceClass.internal.School;

public class Miniso implements Barber, School {
    @Override
    public void cutHair() {
        System.out.println("Cutting hair with precision");
    }

    @Override
    public void shave() {
        System.out.println("Shaving the beard smoothly");
    }

    @Override
    public void trimBeard() {
        System.out.println("Trimming the beard to perfection");
    }
    @Override
    public void conductClasses() {
        System.out.println("Conducting high school classes");
    }

    @Override
    public void organizeExams() {
        System.out.println("Organizing high school exams");
    }

    @Override
    public void holdEvents() {
        System.out.println("Holding cultural and sports events");
    }
}
