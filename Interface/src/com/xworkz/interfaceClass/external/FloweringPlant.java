package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Plant;

public class FloweringPlant implements Plant {
    @Override
    public void grow() {
        System.out.println("The plant is growing");
    }

    @Override
    public void photosynthesize() {
        System.out.println("The plant is photosynthesizing");
    }

    @Override
    public void flower() {
        System.out.println("The plant is flowering");
    }
}
