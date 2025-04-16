package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bubble;
import com.xworkz.interfaceClass.internal.Ice;
import com.xworkz.interfaceClass.internal.Mobile;
import com.xworkz.interfaceClass.internal.Zudio;
import com.xworkz.interfaceClass.internal.Lilly;

public class Bulb implements Bubble, Ice, Mobile, Zudio, Lilly {

    // Bubble methods
    @Override
    public void create() {
        System.out.println("Creating light bubbles using LED bulbs");
    }

    @Override
    public void pop() {
        System.out.println("Bulb popped due to a power surge");
    }

    @Override
    public void floatInAir() {
        System.out.println("Glowing bulbs floating in festival air decor");
    }

    // Ice methods
    @Override
    public void freeze() {
        System.out.println("Bulb freezes in extreme cold, needs insulation");
    }

    @Override
    public void store() {
        System.out.println("Storing bulbs in cool, dry place");
    }

    @Override
    public void melt() {
        System.out.println("Bulb heats up and melts plastic cover");
    }

    // Mobile methods
    @Override
    public void makeCall() {
        System.out.println("Smart bulb integrates with mobile to make calls");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending command to bulb via mobile message");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet to control smart bulb settings");
    }

    // Zudio methods
    @Override
    public void design() {
        System.out.println("Designing fashion lighting with trendy bulbs");
    }

    @Override
    public void display() {
        System.out.println("Displaying bulb-themed outfits in Zudio window");
    }

    @Override
    public void discount() {
        System.out.println("Offering festive discounts on light bulbs");
    }

    // Lilly methods
    @Override
    public void bloom() {
        System.out.println("The bulb-shaped Lilly blooms at dusk");
    }

    @Override
    public void fragrance() {
        System.out.println("The Lilly under the bulb spreads gentle fragrance");
    }

    @Override
    public void wilt() {
        System.out.println("Lilly wilts due to excessive bulb heat");
    }
}
