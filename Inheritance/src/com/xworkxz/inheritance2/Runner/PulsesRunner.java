package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Lentils;
import com.xworkxz.inheritance2.superclass.Pulses;

public class PulsesRunner {
    public static void main(String[] args) {
        Pulses pulses = new Pulses();
        pulses.type();
        pulses.proteinContent();
        pulses.weight();
        pulses.origin();
        pulses.price();

        Pulses pulses1 = new Lentils();
        pulses1.type();
        pulses1.proteinContent();
        pulses1.weight();
        pulses1.origin();
        pulses1.price();

        Lentils lentils = new Lentils();
        lentils.type();
        lentils.proteinContent();
        lentils.weight();
        lentils.origin();
        lentils.price();
    }}