package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mobile;

public class Smartphone implements Mobile {
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
}
