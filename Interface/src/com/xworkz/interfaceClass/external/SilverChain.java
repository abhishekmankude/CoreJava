package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Chain;

public class SilverChain implements Chain {
    @Override
    public void wear() {
        System.out.println("Wearing the silver chain");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the silver chain");
    }

    @Override
    public void remove() {
        System.out.println("Removing the silver chain");
    }
}
