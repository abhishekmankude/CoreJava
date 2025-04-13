package com.xworkz.ToString.internal;

public class Cap {
    private String color;

    public Cap(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "Cap color: " + this.color + ", brand: ";
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
            if(object instanceof Cap) {
                System.out.println("ref is Cap, will compare...");
                Cap cap = this;
                Cap cap1 = (Cap) object;
                if(cap.color.equals(cap1.color))
                        {
                    return true;
                }
            }
        }
        return false;
    }
}