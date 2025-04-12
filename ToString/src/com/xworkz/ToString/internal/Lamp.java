package com.xworkz.ToString.internal;

public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lamp type " + this.type + " color " + this.color + " price " + this.price;
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
                if(lamp.type.equals(lamp1.type) && lamp.color.equals(lamp1.color) && lamp.price == lamp1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}