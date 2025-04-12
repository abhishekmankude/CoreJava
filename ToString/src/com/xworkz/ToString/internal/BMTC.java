package com.xworkz.ToString.internal;

public class BMTC {
    private String cityName;
    private String route;
    private int minimumCost;

    public BMTC(String cityName, String route, int minimumCost) {
        this.cityName = cityName;
        this.route = route;
        this.minimumCost = minimumCost;
    }

    @Override
    public String toString() {
        return "BMTC city: " + this.cityName + ", route: " + this.route + ", minimum cost: " + this.minimumCost;
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
            if(object instanceof BMTC) {
                System.out.println("ref is BMTC, will compare...");
                BMTC bmtc = this;
                BMTC bmtc1 = (BMTC) object;
                if(bmtc.cityName.equals(bmtc1.cityName) && bmtc.route.equals(bmtc1.route) && bmtc.minimumCost == bmtc1.minimumCost) {
                    return true;
                }
            }
        }
        return false;
    }
}