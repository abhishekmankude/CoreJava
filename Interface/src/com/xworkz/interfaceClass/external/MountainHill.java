package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Hill;

public class MountainHill implements Hill {
    @Override
    public void climb() {
        System.out.println("Climbing the mountain hill");
    }

    @Override
    public void enjoyView() {
        System.out.println("Enjoying the beautiful view from the hilltop");
    }

    @Override
    public void descend() {
        System.out.println("Descending the mountain hill");
    }
}
