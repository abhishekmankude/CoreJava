package com.xworkz.ToString.internal;

public class Park {
    private String name;
    private String location;
    private int area;

    public Park(String name, String location, int area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Park name: " + name + ", location: " + location + ", area: " + area + " mtrs";
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
            if(object instanceof Park) {
                System.out.println("ref is Park, will compare...");
                Park park = this;
                Park park1 = (Park) object;
                if(park.name.equals(park1.name) && park.location.equals(park1.location) && park.area == park1.area) {
                    return true;
                }
            }
        }
        return false;
    }
}