package com.xworkz.ToString.internal;

public class Jet {
    private String model;
    private int speed;


    public Jet(String model, int speed) {
        this.model = model;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return "Jet model: " + this.model + ", speed: " + this.speed ;
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
            if(object instanceof Jet) {
                System.out.println("ref is Jet, will compare...");
                Jet jet = this;
                Jet jet1 = (Jet) object;
                if(jet.model.equals(jet1.model) && jet.speed == jet1.speed) {
                    return true;
                }
            }
        }
        return false;
    }
}