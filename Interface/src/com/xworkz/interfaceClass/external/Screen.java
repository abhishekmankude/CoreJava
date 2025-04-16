package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Movie;
import com.xworkz.interfaceClass.internal.Mirror;

public class Screen implements Movie, Mirror {

    @Override
    public void play() {
        System.out.println("Screen is playing the movie in HD");
    }

    @Override
    public void pause() {
        System.out.println("Screen has paused the movie");
    }

    @Override
    public void stop() {
        System.out.println("Screen has stopped the movie");
    }

    @Override
    public void reflect() {
        System.out.println("Screen is reflecting the image clearly");
    }

    @Override
    public void clean() {
        System.out.println("Screen is cleaned with a microfiber cloth");
    }

    @Override
    public void frame() {
        System.out.println("Screen is framed with an aluminum border");
    }
}
