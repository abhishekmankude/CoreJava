package com.xworkz.ToString.internal;

public class Fan {
    private String type;
    private int cost;
    private int speed;

    public Fan(String type, int cost, int speed) {
        this.type = type;
        this.cost = cost;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan type: " + this.type + ", cost: " + this.cost + ", speed: " + this.speed + " RPM";
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
            if(object instanceof Fan) {
                System.out.println("ref is Fan, will compare...");
                Fan fan = this;
                Fan fan1 = (Fan) object;
                if(fan.type.equals(fan1.type) &&
                        fan.cost == fan1.cost &&
                        fan.speed == fan1.speed) {
                    return true;
                }
            }
        }
        return false;
    }
}