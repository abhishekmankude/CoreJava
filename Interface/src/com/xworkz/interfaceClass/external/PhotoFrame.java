package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Frame;

public class PhotoFrame implements Frame {
    @Override
    public void design() {
        System.out.println("Designing a beautiful photo frame");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the components of the photo frame");
    }

    @Override
    public void display() {
        System.out.println("Displaying the photo frame with a picture");
    }
}
