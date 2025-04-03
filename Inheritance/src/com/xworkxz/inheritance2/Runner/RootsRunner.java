package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Carrot;
import com.xworkxz.inheritance2.superclass.Roots;

public class RootsRunner {
    public static void main(String[] args) {
        Roots roots = new Roots();
        roots.color();
        roots.kg();
        roots.size();
        roots.origin();
        roots.price();

        Roots roots1 = new Carrot();
        roots1.color();
        roots1.kg();
        roots1.size();
        roots1.origin();
        roots1.price();

        Carrot carrot = new Carrot();
        carrot.color();
        carrot.kg();
        carrot.size();
        carrot.origin();
        carrot.price();
    }
}