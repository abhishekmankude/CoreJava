package com.xworkz.ToString.internal;

public class Driver {
    private String name;
    private String licenseNumber;
    private int experience;

    public Driver(String name, String licenseNumber, int experience) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver name: " + this.name + ", license: " + this.licenseNumber + ", experience: " + this.experience + " years";
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
                if(driver.name.equals(driver1.name) &&
                        driver.licenseNumber.equals(driver1.licenseNumber) &&
                        driver.experience == driver1.experience) {
                    return true;
                }
            }
        }
        return false;
    }
}