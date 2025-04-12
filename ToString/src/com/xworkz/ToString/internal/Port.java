package com.xworkz.ToString.internal;

public class Port {
    private String type;
    private int number;
    private int speed;

    public Port(String type, int number, int speed) {
        this.type = type;
        this.number = number;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Port type: " + type + ", number: " + number + ", speed: " + speed;
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
            if(object instanceof Port) {
                System.out.println("ref is Port, will compare...");
                Port port = this;
                Port port1 = (Port) object;
                if(port.type.equals(port1.type) && port.number == port1.number && port.speed == port1.speed) {
                    return true;
                }
            }
        }
        return false;
    }
}