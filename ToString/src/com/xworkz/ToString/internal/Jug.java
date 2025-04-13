package com.xworkz.ToString.internal;

public class Jug {
    private String color;
    private int capacity;


    public Jug(String color, int capacity, String shape) {
        this.color = color;
        this.capacity = capacity;

        System.out.println("no arg const in Jug");
    }

    public Jug(String red, int capacity) {
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Capacity: " + this.capacity ;
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
            if(object instanceof Jug) {
                System.out.println("ref is Jug, will compare...");
                Jug jug = this;
                Jug jug1 = (Jug) object;
                if(jug.color.equals(jug1.color) && jug.capacity == jug1.capacity ) {
                    return true;
                }
            }
        }
        return false;
    }
}