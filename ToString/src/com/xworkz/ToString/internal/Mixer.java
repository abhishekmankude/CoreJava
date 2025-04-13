package com.xworkz.ToString.internal;

public class Mixer {
    private String brand;
    private int jars;


    public Mixer(String brand, int jars) {
        this.brand = brand;
        this.jars = jars;

    }

    @Override
    public String toString() {
        return "Mixer brand: " + brand + ", jars: " + jars ;
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
            if(object instanceof Mixer) {
                System.out.println("ref is Mixer, will compare...");
                Mixer mixer = this;
                Mixer mixer1 = (Mixer) object;
                if(mixer.brand.equals(mixer1.brand) && mixer.jars == mixer1.jars) {
                    return true;
                }
            }
        }
        return false;
    }
}