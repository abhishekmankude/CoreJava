package com.xworkz.Internal;

public class CollegeImpli implements College{
    public CollegeImpli(){
        System.out.println("No arg constructor collegeimpli");
    }
    @Override
    public void students() {
        System.out.println("Overiding Stdent in collegeimpli");
    }

}
