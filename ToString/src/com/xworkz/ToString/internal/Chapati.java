package com.xworkz.ToString.internal;

public class Chapati {
    private String flourType;

    public Chapati(String flourType) {
        this.flourType = flourType;

    }

    @Override
    public String toString() {
        return "Chapati flour type: " + this.flourType ;
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
            if(object instanceof Chapati) {
                System.out.println("ref is Chapati, will compare...");
                Chapati chapati = this;
                Chapati chapati1 = (Chapati) object;
                if(chapati.flourType.equals(chapati1.flourType)) {
                    return true;
                }
            }
        }
        return false;
    }
}