package com.xworkz.ToString.internal;

public class Ipl {
    private String teamName;
    private String captain;
    private int wins;

    public Ipl(String teamName, String captain, int wins) {
        this.teamName = teamName;
        this.captain = captain;
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "IPL Team: " + teamName + ", Captain: " + captain + ", Wins: " + wins;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}