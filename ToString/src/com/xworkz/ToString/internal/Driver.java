package com.xworkz.ToString.internal;

public class Driver {
    private String name;


    public Driver(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Driver name: " + this.name + ", license: " ;
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
            if(object instanceof Driver) {
                System.out.println("ref is Driver, will compare...");
                Driver driver = this;
                Driver driver1 = (Driver) object;
                if(driver.name.equals(driver1.name)) {
                    return true;
                }
            }
        }
        return false;
    }
}