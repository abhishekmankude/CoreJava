package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Necklace;
import com.xworkxz.inheritance2.superclass.Jewelry;

public class JewelryRunner {
    public static void main(String[] args) {
        Jewelry jewelry = new Jewelry();
        jewelry.wear();
        jewelry.polish();
        jewelry.clean();
        jewelry.store();
        jewelry.appraise();

        Jewelry jewelry1 = new Necklace();
        jewelry1.wear();
        jewelry1.polish();
        jewelry1.clean();
        jewelry1.store();
        jewelry1.appraise();

        Necklace necklace = new Necklace();
        necklace.wear();
        necklace.polish();
        necklace.clean();
        necklace.store();
        necklace.appraise();
    }
}