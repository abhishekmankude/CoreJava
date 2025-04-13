package com.xworkz.ToString.internal;

public class Metro {
    private String city;
    private String lineColor;


    public Metro(String city, String lineColor) {
        this.city = city;
        this.lineColor = lineColor;

    }

    @Override
    public String toString() {
        return "Metro city: " + city + ", line color: " + lineColor ;
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
            if(object instanceof Metro) {
                System.out.println("ref is Metro, will compare...");
                Metro metro = this;
                Metro metro1 = (Metro) object;
                if(metro.city.equals(metro1.city) && metro.lineColor.equals(metro1.lineColor)) {
                    return true;
                }
            }
        }
        return false;
    }
}