package com.xworkz.ToString.internal;

public class Star {
    private String name;
    private int temperature;
    private int distanceFromEarth;

    public Star(String name, int temperature, int distanceFromEarth) {
        this.name = name;
        this.temperature = temperature;
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Star name: " + name + ", temperature: " + temperature + "K, distance: " + distanceFromEarth + " light years";
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof Star) {
                System.out.println("ref is Star, will compare...");
                Star star = this;
                Star star1 = (Star) object;
                if(star.name.equals(star1.name) && star.temperature == star1.temperature && star.distanceFromEarth == star1.distanceFromEarth) {
                    return true;
                }
            }
        }
        return false;
    }
}