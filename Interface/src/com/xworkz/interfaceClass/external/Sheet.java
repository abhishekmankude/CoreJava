package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Wheel;
import com.xworkz.interfaceClass.internal.Barbie;
import com.xworkz.interfaceClass.internal.Lassi;
import com.xworkz.interfaceClass.internal.Towel;
import com.xworkz.interfaceClass.internal.Barber;

public class Sheet implements Wheel, Barbie, Lassi, Towel, Barber {

    @Override
    public void rotate() {
        System.out.println("Sheet wheel is rotating.");
    }

    @Override
    public void inflate() {
        System.out.println("Sheet wheel is inflating.");
    }

    @Override
    public void repair() {
        System.out.println("Sheet wheel is repairing.");
    }

    @Override
    public void dressUp() {
        System.out.println("Sheet Barbie dressing up.");
    }

    @Override
    public void play() {
        System.out.println("Sheet Barbie playing.");
    }

    @Override
    public void collect() {
        System.out.println("Sheet Barbie collection in progress.");
    }

    @Override
    public void mix() {
        System.out.println("Sheet lassi mixing.");
    }

    @Override
    public void serve() {
        System.out.println("Sheet lassi serving.");
    }

    @Override
    public void drink() {
        System.out.println("Sheet lassi drinking.");
    }

    @Override
    public void dry() {
        System.out.println("Sheet towel drying.");
    }

    @Override
    public void fold() {
        System.out.println("Sheet towel folding.");
    }

    @Override
    public void wash() {
        System.out.println("Sheet towel washing.");
    }

    @Override
    public void cutHair() {
        System.out.println("Sheet barber cutting hair.");
    }

    @Override
    public void shave() {
        System.out.println("Sheet barber shaving.");
    }

    @Override
    public void trimBeard() {
        System.out.println("Sheet barber trimming beard.");
    }
}
