package com.xworkz.ToString.internal;

public class BMTC {
        private String cityName;
        private String route;
        private int minimumCost;

        public BMTC(String cityName, String route, int minimumCost){
            this.cityName=cityName;
            this.route = route;
            this.minimumCost=minimumCost;
        }

        @Override
        public String toString() {
            return "BMTC city "+this.cityName+" BMTC route "+this.route+" Pant MinimumCost "+this.minimumCost;
        }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }

    }


