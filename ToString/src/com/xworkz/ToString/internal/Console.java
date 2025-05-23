package com.xworkz.ToString.internal;

public class Console {
    private String name;


    public Console(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Console name: " + this.name + ", manufacturer: ";
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
            if(object instanceof Console) {
                System.out.println("ref is Console, will compare...");
                Console console = this;
                Console console1 = (Console) object;
                if(console.name.equals(console1.name)) {
                    return true;
                }
            }
        }
        return false;
    }
}