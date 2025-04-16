package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Student;

public class CollegeStudent implements Student {
    @Override
    public void study() {
        System.out.println("College student is studying computer science");
    }

    @Override
    public void attendClass() {
        System.out.println("College student is attending lectures");
    }

    @Override
    public void writeExam() {
        System.out.println("College student is writing semester exams");
    }
}
