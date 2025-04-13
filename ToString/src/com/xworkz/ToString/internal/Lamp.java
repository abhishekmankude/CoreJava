package com.xworkz.ToString.internal;

public class Lamp {
    private String type;
    private String color;


    public Lamp(String type, String color) {
        this.type = type;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Lamp type " + this.type + " color " + this.color ;
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
            if(object instanceof Lamp) {
                System.out.println("ref is Lamp, will compare...");
                Lamp lamp = this;
                Lamp lamp1 = (Lamp) object;
                if(lamp.type.equals(lamp1.type) && lamp.color.equals(lamp1.color) ) {
                    return true;
                }
            }
        }
        return false;
    }
}