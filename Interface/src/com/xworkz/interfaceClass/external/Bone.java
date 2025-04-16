package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Bone implements Movie, Water, Lens , Thief, Burger {
    @Override
    public void play() {
        System.out.println("Playing the action movie");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the action movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the action movie");
    }
    @Override
    public void flow() {
        System.out.println("Water is flowing in the river");
    }

    @Override
    public void purify() {
        System.out.println("Purifying the river water");
    }

    @Override
    public void store() {
        System.out.println("Storing water in a reservoir");
    }
    @Override
    public void focus() {
        System.out.println("Focusing the camera lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming the camera lens");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the camera lens");
    }
    @Override
    public void steal() {
        System.out.println("Robber is stealing valuable items");
    }

    @Override
    public void escape() {
        System.out.println("Robber is escaping from the crime scene");
    }

    @Override
    public void hide() {
        System.out.println("Robber is hiding in a safe place");
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious veggie burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving the veggie burger with fries");
    }

    @Override
    public void eat() {
        System.out.println("Eating the veggie burger with sauce");
    }
}
