package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Chats;

public class WhatsAppChats implements Chats {
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
}
