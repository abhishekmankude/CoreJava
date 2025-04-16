package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Ice;
import com.xworkz.interfaceClass.internal.Mobile;

public class Shape implements Mobile, Ice {
    @Override
    public void makeCall() {
        System.out.println("Making a call from the smartphone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message from the smartphone");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet on the smartphone");
    }
    @Override
    public void freeze() {
        System.out.println("Freezing water into ice cubes");
    }

    @Override
    public void store() {
        System.out.println("Storing ice cubes in the freezer");
    }

    @Override
    public void melt() {
        System.out.println("Melting the ice cubes");
    }
}
