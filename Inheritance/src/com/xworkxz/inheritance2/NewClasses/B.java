package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.A;
import com.xworkxz.inheritance2.superclass.AlphabetsStartingFrom;

public class B {
    public void range(AlphabetsStartingFrom alphabetsStartingFrom) {
    alphabetsStartingFrom.sizeOfAlphabet();
    alphabetsStartingFrom.positionOfAlphabet();


    if(alphabetsStartingFrom instanceof A)
    {
        A a=(A)alphabetsStartingFrom;
        a.country();
    }

    }
}
