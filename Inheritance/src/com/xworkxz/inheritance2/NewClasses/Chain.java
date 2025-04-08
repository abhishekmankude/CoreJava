package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Necklace;
import com.xworkxz.inheritance2.superclass.Jewelry;

public class Chain {
    public void maintain(Jewelry jewelry) {
        jewelry.wear();
        jewelry.polish();
        jewelry.clean();
        jewelry.store();
        jewelry.appraise();

        if(jewelry instanceof Necklace) {
            Necklace necklace = (Necklace)jewelry;
            necklace.country();
        }
    }
}