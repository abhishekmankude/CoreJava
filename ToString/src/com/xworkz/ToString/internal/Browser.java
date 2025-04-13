package com.xworkz.ToString.internal;

public class Browser {
    private String name;


    public Browser(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Browser name: " + this.name + ", version: ";
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
                if(browser.name.equals(browser1.name)) {
                    return true;
                }
            }
        }
        return false;
    }
}