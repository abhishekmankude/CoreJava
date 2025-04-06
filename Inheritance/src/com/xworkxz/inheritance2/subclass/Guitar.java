package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.MusicalInstrument;

public class Guitar extends MusicalInstrument {
    public Guitar() { System.out.println("Guitar constructor"); }

@Override
public void play() { System.out.println("Guitar being played"); }
    public void tune() { System.out.println("Guitar being tuned"); }
    public void clean() { System.out.println("Guitar being cleaned"); }
    public void store() { System.out.println("Guitar being stored"); }
    public void transport() { System.out.println("Guitar being transported"); }
}