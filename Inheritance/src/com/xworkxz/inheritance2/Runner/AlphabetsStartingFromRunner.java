package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.B;
import com.xworkxz.inheritance2.subclass.A;
import com.xworkxz.inheritance2.superclass.AlphabetsStartingFrom;

public class AlphabetsStartingFromRunner {
    public static void main(String[] args) {
        AlphabetsStartingFrom alphabetsStartingFrom=new AlphabetsStartingFrom();
        alphabetsStartingFrom.positionOfAlphabet();
        alphabetsStartingFrom.sizeOfAlphabet();

        A a=new A();
        a.positionOfAlphabet();
        a.sizeOfAlphabet();

        AlphabetsStartingFrom alphabetsStartingFrom1=new A();
        alphabetsStartingFrom.positionOfAlphabet();
        alphabetsStartingFrom.sizeOfAlphabet();

        B b=new B();
        b.range(alphabetsStartingFrom);
        b.range(a);

    }
}
