package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Wheel;
import com.xworkz.interfaceClass.internal.Barbie;
import com.xworkz.interfaceClass.internal.Lassi;
import com.xworkz.interfaceClass.internal.Towel;
import com.xworkz.interfaceClass.internal.Barber;

public class Watch implements Wheel, Barbie, Lassi, Towel, Barber {

    @Override
    public void rotate() {
        System.out.println("Watch wheel is rotating smoothly.");
    }

    @Override
    public void inflate() {
        System.out.println("Inflating the watch wheel.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the watch wheel.");
    }

    @Override
    public void dressUp() {
        System.out.println("Watch Barbie is being dressed stylishly.");
    }

    @Override
    public void play() {
        System.out.println("Watch Barbie is ready for playtime.");
    }

    @Override
    public void collect() {
        System.out.println("Collecting watch-themed Barbie dolls.");
    }

    @Override
    public void mix() {
        System.out.println("Watch is mixing lassi ingredients.");
    }

    @Override
    public void serve() {
        System.out.println("Watch is serving lassi with chill.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking the lassi made by Watch.");
    }

    @Override
    public void dry() {
        System.out.println("Watch towel is drying quickly.");
    }

    @Override
    public void fold() {
        System.out.println("Folding the watch towel neatly.");
    }

    @Override
    public void wash() {
        System.out.println("Washing the watch towel gently.");
    }

    @Override
    public void cutHair() {
        System.out.println("Watch barber is cutting hair stylishly.");
    }

    @Override
    public void shave() {
        System.out.println("Watch barber is giving a smooth shave.");
    }

    @Override
    public void trimBeard() {
        System.out.println("Watch barber is trimming the beard evenly.");
    }
}
