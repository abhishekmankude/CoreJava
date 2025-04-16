package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Plastic;
import com.xworkz.interfaceClass.internal.Rice;

public class Spoon implements Plastic, Rice {

    @Override
    public void mold() {
        System.out.println("Molding spoon from high-quality plastic");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling used plastic spoons");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing spoon in eco-friendly way");
    }

    @Override
    public void cook() {
        System.out.println("Spoon is used while cooking rice");
    }

    @Override
    public void store() {
        System.out.println("Storing cooked rice with spoon help");
    }

    @Override
    public void harvest() {
        System.out.println("Describing the rice harvesting process");
    }
}
