package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Fest;

public class MusicFest implements Fest {
    @Override
    public void organize() {
        System.out.println("Organizing a music festival");
    }

    @Override
    public void promote() {
        System.out.println("Promoting the music festival with posters and social media");
    }

    @Override
    public void celebrate() {
        System.out.println("Celebrating the music festival with performances and crowd participation");
    }
}
