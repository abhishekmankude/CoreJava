package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Moon;
import com.xworkz.interfaceClass.internal.Key;
import com.xworkz.interfaceClass.internal.Bed;
import com.xworkz.interfaceClass.internal.Barber;
import com.xworkz.interfaceClass.internal.School;

public class Piano implements Moon, Key, Bed, Barber, School {

    // Moon methods
    @Override
    public void rise() {
        System.out.println("The piano's sound rises in harmony with the full moon");
    }

    @Override
    public void shine() {
        System.out.println("The piano shines brightly under the moonlight");
    }

    @Override
    public void set() {
        System.out.println("The piano's music sets like the moon at dawn");
    }

    // Key methods
    @Override
    public void insert() {
        System.out.println("Inserting the piano key into its designated place");
    }

    @Override
    public void turn() {
        System.out.println("Turning the piano key to tune the instrument");
    }

    @Override
    public void remove() {
        System.out.println("Removing the piano key for maintenance");
    }

    // Bed methods
    @Override
    public void layDown() {
        System.out.println("Laying down on the king-size bed, enjoying the melody");
    }

    @Override
    public void make() {
        System.out.println("Making the bed while listening to soothing piano music");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping peacefully after a night of piano music");
    }

    // Barber methods
    @Override
    public void cutHair() {
        System.out.println("Cutting hair while enjoying the smooth sounds of the piano");
    }

    @Override
    public void shave() {
        System.out.println("Shaving while the piano plays a calming tune");
    }

    @Override
    public void trimBeard() {
        System.out.println("Trimming beard with piano music in the background");
    }

    // School methods
    @Override
    public void conductClasses() {
        System.out.println("Conducting music classes focused on piano playing");
    }

    @Override
    public void organizeExams() {
        System.out.println("Organizing piano exams to test musical skills");
    }

    @Override
    public void holdEvents() {
        System.out.println("Holding piano recitals and music events at school");
    }
}
