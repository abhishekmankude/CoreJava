package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Marker;

public class WhiteboardMarker implements Marker {
    @Override
    public void write() {
        System.out.println("Writing with the whiteboard marker");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the whiteboard marker ink");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the whiteboard marker");
    }
}
