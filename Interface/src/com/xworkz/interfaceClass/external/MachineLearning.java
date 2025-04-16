package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.AI;

public class MachineLearning implements AI {
    @Override
    public void learn() {
        System.out.println("Machine learning model is learning from data");
    }

    @Override
    public void predict() {
        System.out.println("Machine learning model is making predictions");
    }

    @Override
    public void optimize() {
        System.out.println("Machine learning model is optimizing its performance");
    }
}
