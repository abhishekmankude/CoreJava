package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Weather;

public class SeasonalWeather implements Weather {
    @Override
    public void change() {
        System.out.println("The weather is changing as seasons shift");
    }

    @Override
    public void forecast() {
        System.out.println("Forecasting the weather for the upcoming days");
    }

    @Override
    public void stabilize() {
        System.out.println("The weather is stabilizing after the storm");
    }
}
