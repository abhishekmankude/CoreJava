package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barber;

public class ProfessionalBarber implements Barber {
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
}
