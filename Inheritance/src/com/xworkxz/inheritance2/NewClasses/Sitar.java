package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Guitar;
import com.xworkxz.inheritance2.superclass.MusicalInstrument;

public class Sitar {
    public void maintain(MusicalInstrument instrument) {
        instrument.play();
        instrument.tune();
        instrument.clean();
        instrument.store();
        instrument.transport();

        if(instrument instanceof Guitar) {
            Guitar guitar = (Guitar)instrument;
            guitar.country();
        }
    }
}