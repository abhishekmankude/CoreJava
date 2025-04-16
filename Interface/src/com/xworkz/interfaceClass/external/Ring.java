package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Chats;
import com.xworkz.interfaceClass.internal.Noodles;

public class Ring implements Chats, Noodles {
    @Override
    public void sendMessage() {
        System.out.println("Sending a message on WhatsApp");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving a message on WhatsApp");
    }

    @Override
    public void shareFile() {
        System.out.println("Sharing a file on WhatsApp");
    }
    @Override
    public void boil() {
        System.out.println("Boiling the instant noodles");
    }

    @Override
    public void season() {
        System.out.println("Adding seasoning to the noodles");
    }

    @Override
    public void serve() {
        System.out.println("Serving the noodles in a bowl");
    }

}
