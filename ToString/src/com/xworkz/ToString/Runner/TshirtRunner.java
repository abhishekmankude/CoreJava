package com.xworkz.ToString.Runner;

import com.xworkz.ToString.exampleInternal.Tshirts;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirts tshirts=new Tshirts();
        tshirts.setBrand("Zudio");
        tshirts.setQuality("cotton");
        tshirts.setSize(30);

        Tshirts tshirts1=new Tshirts();
        tshirts1.setSize(30);
        tshirts1.setBrand("Zudio");
        tshirts1.setQuality("cotton");

        boolean status=tshirts.equals(tshirts1);
        System.out.println(status);


    }
}
