package com.xworkz.External;

import com.xworkz.Internal.College;

public class University {
    private College college;

    public University(College college){
        this.college=college;
        System.out.println("Assigning instance college");
    }
    public void staff(){
        if(this.college!=null){
            this.college.students();
        }else{
            System.out.println("Null");
        }

    }
}
