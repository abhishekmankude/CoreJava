package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Guitar;
import com.xworkxz.inheritance2.superclass.MusicalInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument();
        instrument.play();
        instrument.tune();
        instrument.clean();
        instrument.store();
        instrument.transport();

        MusicalInstrument instrument1 = new Guitar();
        instrument1.play();
        instrument1.tune();
        instrument1.clean();
        instrument1.store();
        instrument1.transport();

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();
        guitar.clean();
        guitar.store();
        guitar.transport();
    }
}