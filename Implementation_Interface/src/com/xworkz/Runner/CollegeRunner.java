package com.xworkz.Runner;

import com.xworkz.External.University;
import com.xworkz.Internal.College;
import com.xworkz.Internal.CollegeImpli;

public class CollegeRunner {
    public static void main(String[] args) {
        College college=new CollegeImpli();
        University university=new University(college);
        university.staff();
    }
}
