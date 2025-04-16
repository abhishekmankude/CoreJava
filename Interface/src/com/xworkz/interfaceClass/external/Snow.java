package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mall;
import com.xworkz.interfaceClass.internal.Weather;
import com.xworkz.interfaceClass.internal.Bird;
import com.xworkz.interfaceClass.internal.Movie;
import com.xworkz.interfaceClass.internal.Dance;

public class Snow implements Mall, Weather, Bird, Movie, Dance {


    @Override
    public void open() {
        System.out.println("The snow-covered mall is opening for shoppers");
    }

    @Override
    public void close() {
        System.out.println("Closing the mall early due to heavy snowfall");
    }

    @Override
    public void offerDeals() {
        System.out.println("Offering winter deals and snow season discounts");
    }


    @Override
    public void change() {
        System.out.println("The weather is changing with snowflakes falling");
    }

    @Override
    public void forecast() {
        System.out.println("Forecasting heavy snow in the coming days");
    }

    @Override
    public void stabilize() {
        System.out.println("Snowfall stabilizing, leading to calm weather");
    }


    @Override
    public void fly() {
        System.out.println("A sparrow flies through the snow-covered sky");
    }

    @Override
    public void sing() {
        System.out.println("The sparrow sings despite the cold");
    }

    @Override
    public void buildNest() {
        System.out.println("Building a warm nest for snowy days");
    }


    @Override
    public void play() {
        System.out.println("Playing a snow-themed action movie");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the movie for a hot cocoa break");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the movie as snow piles outside");
    }

    @Override
    public void perform() {
        System.out.println("Performing a graceful ballet on a snowy stage");
    }

    @Override
    public void practice() {
        System.out.println("Practicing ballet indoors while snow falls outside");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a ballet inspired by snowfall");
    }
}
