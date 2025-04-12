package com.xworkz.ToString.internal;

public class Ocean {
    private String name;
    private int depth;
    private int area;

    public Ocean(String name, int depth, int area) {
        this.name = name;
        this.depth = depth;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Ocean name: " + this.name + ", depth: " + this.depth + " meters, area: " + this.area + " sq km";
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("ref is not null");
            if (object instanceof Ocean) {
                System.out.println("ref is Ocean, will compare...");
                Ocean ocean = (Ocean) object;
                return this.name.equals(ocean.name) &&
                        this.depth == ocean.depth &&
                        this.area == ocean.area;
            }
        }
        return false;
    }
}
