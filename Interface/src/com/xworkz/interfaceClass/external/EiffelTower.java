package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Tower;

public class EiffelTower implements Tower {
    @Override
    public void build() {
        System.out.println("Building the Eiffel Tower");
    }

    @Override
    public void lightUp() {
        System.out.println("Lighting up the Eiffel Tower at night");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the Eiffel Tower for preservation");
    }
}
