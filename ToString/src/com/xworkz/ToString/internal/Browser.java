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
        return "Browser name: " + this.name + ", version: " + this.version + ", release year: " + this.releaseYear;
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
            if(object instanceof Browser) {
                System.out.println("ref is Browser, will compare...");
                Browser browser = this;
                Browser browser1 = (Browser) object;
                if(browser.name.equals(browser1.name) && browser.version.equals(browser1.version) && browser.releaseYear == browser1.releaseYear) {
                    return true;
                }
            }
        }
        return false;
    }
}