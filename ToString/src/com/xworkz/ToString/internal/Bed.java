package com.xworkz.ToString.internal;

public class Bed {
    private String type;

    public Bed(String type) {
        this.type = type;

    }

    @Override
    public String toString() {
        return "Bed type: " ;
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
            if(object instanceof Bed) {
                System.out.println("ref is Bed, will compare...");
                Bed bed = this;
                Bed bed1 = (Bed) object;
                if(bed.type.equals(bed1.type) ) {
                    return true;
                }
            }
        }
        return false;
    }
}