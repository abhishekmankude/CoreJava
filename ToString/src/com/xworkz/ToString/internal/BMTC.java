package com.xworkz.ToString.internal;

public class BMTC {
    private String cityName;


    public BMTC(String cityName) {
        this.cityName = cityName;

    }

    @Override
    public String toString() {
        return "BMTC city: " + this.cityName ;
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
                if(bmtc.cityName.equals(bmtc1.cityName) ) {
                    return true;
                }
            }
        }
        return false;
    }
}