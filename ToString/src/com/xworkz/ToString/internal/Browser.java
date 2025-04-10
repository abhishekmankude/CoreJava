package com.xworkz.ToString.internal;

public class Browser {
    private String name;
    private String version;
    private int releaseYear;

    public Browser(String name, String version, int releaseYear) {
        this.name = name;
        this.version = version;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Browser name: " + this. name + ", version: " +  this.version + ", release year: " +  this.releaseYear;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }

}
