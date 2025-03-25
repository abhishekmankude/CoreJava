package com.access.packages.runner;

import com.access.packages.Bag;

public class RunnerForBag {
    public static void main(String[] args) {
       Bag bag=new Bag();
       bag.costDisplay();
       bag.displayBrand();
      //  bag.displayCost(); having private access

    }
}
