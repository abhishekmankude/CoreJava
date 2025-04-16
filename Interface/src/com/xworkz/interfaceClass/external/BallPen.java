package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Pen;

public class BallPen implements Pen {
    @Override
    public void write() {
        System.out.println("Writing with the ball pen");
    }

    @Override
    public void open() {
        System.out.println("Opening the ball pen");
    }

    @Override
    public void close() {
        System.out.println("Closing the ball pen");
    }
}
