package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Teacher;

public class MathTeacher implements Teacher {
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
