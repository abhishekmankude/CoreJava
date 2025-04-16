package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Tree;

public class OakTree implements Tree {
    @Override
    public void grow() {
        System.out.println("The oak tree is growing tall");
    }

    @Override
    public void provideShade() {
        System.out.println("The oak tree provides shade during the summer");
    }

    @Override
    public void shedLeaves() {
        System.out.println("The oak tree sheds its leaves in the fall");
    }
}
