package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Noodles;

public class InstantNoodles implements Noodles {
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
