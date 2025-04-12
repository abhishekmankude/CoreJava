package com.xworkz.ToString.internal;

public class Printer {
    private String brand;
    private boolean colorPrint;
    private int pagesPerMinute;

    public Printer(String brand, boolean colorPrint, int pagesPerMinute) {
        this.brand = brand;
        this.colorPrint = colorPrint;
        this.pagesPerMinute = pagesPerMinute;
    }

    @Override
    public String toString() {
        return "Printer brand: " + brand + ", colorPrint: " + colorPrint + ", PPM: " + pagesPerMinute;
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
            if(object instanceof Printer) {
                System.out.println("ref is Printer, will compare...");
                Printer printer = this;
                Printer printer1 = (Printer) object;
                if(printer.brand.equals(printer1.brand) && printer.colorPrint == printer1.colorPrint && printer.pagesPerMinute == printer1.pagesPerMinute) {
                    return true;
                }
            }
        }
        return false;
    }
}