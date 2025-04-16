package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mirror;

public class WallMirror implements Mirror {
    @Override
    public void reflect() {
        System.out.println("The mirror reflects the image");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mirror for clarity");
    }

    @Override
    public void frame() {
        System.out.println("Framing the mirror with an elegant border");
    }
}
