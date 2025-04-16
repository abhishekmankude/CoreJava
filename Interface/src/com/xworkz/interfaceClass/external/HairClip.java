package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Clip;

public class HairClip implements Clip {
    @Override
    public void attach() {
        System.out.println("Attaching the hair clip to the hair");
    }

    @Override
    public void secure() {
        System.out.println("Securing the hair clip tightly");
    }

    @Override
    public void remove() {
        System.out.println("Removing the hair clip from the hair");
    }
}
