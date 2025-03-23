package com.xworkz.References_and_Variables;

public class Experience {

    ExperienceDetail experienceDetails;
    Experience(ExperienceDetail experienceDetails){
        this.experienceDetails=experienceDetails;
    }



    void experienceDisplay(){
        System.out.println("Experience details");

        if(this.experienceDetails!=null){
            this.experienceDetails.expDisplay();
        }
        else System.err.println("Pointing to null");


    }
}{
}
