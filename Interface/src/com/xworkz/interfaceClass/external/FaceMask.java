package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mask;

public class FaceMask implements Mask {
    @Override
    public void wear() {
        System.out.println("Wearing the face mask to protect from dust");
    }

    @Override
    public void remove() {
        System.out.println("Removing the face mask after use");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the face mask for reuse");
    }
}
