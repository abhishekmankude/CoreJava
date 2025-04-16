package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Student;
import com.xworkz.interfaceClass.internal.Teacher;

public class Pizza implements Student, Teacher {
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
    @Override
    public void teach() {
        System.out.println("Math teacher is teaching algebra");
    }

    @Override
    public void gradePapers() {
        System.out.println("Math teacher is grading assignments");
    }

    @Override
    public void holdMeeting() {
        System.out.println("Math teacher is holding a faculty meeting");
    }
}
