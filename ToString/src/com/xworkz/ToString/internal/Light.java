package com.xworkz.ToString.internal;

public class Light {
    private String company;
    private String type;
    private int cost;

    public Light(String company, String type, int cost) {
        this.company = company;
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Light company: " + company + ", type: " + type + ", cost: " + cost;
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
            if(object instanceof Light) {
                System.out.println("ref is Light, will compare...");
                Light light = this;
                Light light1 = (Light) object;
                if(light.company.equals(light1.company) && light.type.equals(light1.type) && light.cost == light1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}