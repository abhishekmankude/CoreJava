package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.School;

public class HighSchool implements School {
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
