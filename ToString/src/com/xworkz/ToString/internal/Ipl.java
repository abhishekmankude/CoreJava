package com.xworkz.ToString.internal;

public class Ipl {
    private String teamName;
    private String captain;


    public Ipl(String teamName, String captain) {
        this.teamName = teamName;
        this.captain = captain;

    }

    @Override
    public String toString() {
        return "IPL Team: " + teamName + ", Captain: " + captain ;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof Ipl) {
                System.out.println("ref is Ipl, will compare...");
                Ipl ipl = this;
                Ipl ipl1 = (Ipl) object;
                if(ipl.teamName.equals(ipl1.teamName) && ipl.captain.equals(ipl1.captain)) {
                    return true;
                }
            }
        }
        return false;
    }
}