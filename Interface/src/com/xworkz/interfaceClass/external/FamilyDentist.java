package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dentist;

public class FamilyDentist implements Dentist {
    @Override
    public void cleanTeeth() {
        System.out.println("Cleaning teeth in a gentle way");
    }
    @Override
    public void fillCavity() {
        System.out.println("Filling cavity with composite material");
    }
    @Override
    public void removeTooth() {
        System.out.println("Removing tooth with care");
    }
}
