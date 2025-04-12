package com.xworkz.ToString.internal;

public class PetrolPump {
    private String location;
    private String fuelType;
    private int pricePerLitre;

    public PetrolPump(String location, String fuelType, int pricePerLitre) {
        this.location = location;
        this.fuelType = fuelType;
        this.pricePerLitre = pricePerLitre;
    }

    @Override
    public String toString() {
        return "PetrolPump location: " + location + ", fuel type: " + fuelType + ", price per litre: " + pricePerLitre;
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
            if(object instanceof PetrolPump) {
                System.out.println("ref is PetrolPump, will compare...");
                PetrolPump pump = this;
                PetrolPump pump1 = (PetrolPump) object;
                if(pump.location.equals(pump1.location) && pump.fuelType.equals(pump1.fuelType) && pump.pricePerLitre == pump1.pricePerLitre) {
                    return true;
                }
            }
        }
        return false;
    }
}