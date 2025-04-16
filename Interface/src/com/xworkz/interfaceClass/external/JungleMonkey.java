package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Monkey;

public class JungleMonkey implements Monkey {
    @Override
    public void climb() {
        System.out.println("Monkey is climbing the tree");
    }

    @Override
    public void swing() {
        System.out.println("Monkey is swinging from one branch to another");
    }

    @Override
    public void eatBanana() {
        System.out.println("Monkey is eating a banana");
    }
}
