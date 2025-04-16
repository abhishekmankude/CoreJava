package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dance;
import com.xworkz.interfaceClass.internal.Bird;
import com.xworkz.interfaceClass.internal.Movie;
import com.xworkz.interfaceClass.internal.Zudio;
import com.xworkz.interfaceClass.internal.Weather;

public class Charger implements Dance, Bird, Movie, Zudio, Weather {

    // Dance methods
    @Override
    public void perform() {
        System.out.println("Charger performing energy transfer to device");
    }

    @Override
    public void practice() {
        System.out.println("Practicing efficient power flow");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing smooth charging cycles");
    }

    // Bird methods
    @Override
    public void fly() {
        System.out.println("Charger adapter doesn’t fly, but transfers power quickly");
    }

    @Override
    public void sing() {
        System.out.println("Charger beeps when connected");
    }

    @Override
    public void buildNest() {
        System.out.println("Charger doesn’t build nests but stays in socket");
    }

    // Movie methods
    @Override
    public void play() {
        System.out.println("Charging while playing a movie");
    }

    @Override
    public void pause() {
        System.out.println("Paused movie to focus on fast charging");
    }

    @Override
    public void stop() {
        System.out.println("Stopped movie, unplugging the charger");
    }

    // Zudio methods
    @Override
    public void design() {
        System.out.println("Sleek charger design with compact build");
    }

    @Override
    public void display() {
        System.out.println("Chargers displayed in Zudio electronics section");
    }

    @Override
    public void discount() {
        System.out.println("Zudio offers discount on branded chargers");
    }

    // Weather methods
    @Override
    public void change() {
        System.out.println("Weather change can affect charger efficiency");
    }

    @Override
    public void forecast() {
        System.out.println("Forecast predicts storms, unplug the charger");
    }

    @Override
    public void stabilize() {
        System.out.println("Charger uses surge protector to stabilize current");
    }
}
