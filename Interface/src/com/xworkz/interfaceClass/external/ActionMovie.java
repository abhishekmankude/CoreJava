package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Movie;

public class ActionMovie implements Movie {
    @Override
    public void play() {
        System.out.println("Playing the action movie");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the action movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the action movie");
    }
}
