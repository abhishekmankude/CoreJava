package com.xworkz.inheritance1.Runner;

import com.xworkz.inheritance1.SubClass.*;
import com.xworkz.inheritance1.SuperClass.Shoe;
import com.xworkz.inheritance1.SuperClass.SmartPhone;
import com.xworkz.inheritance1.SuperClass.TrafficLight;
import com.xworkz.inheritance1.SuperClass.Watch;

public class MainRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.color();
        shoe.brand();
        shoe.lase();
        shoe.price();
        shoe.sole();

        Nike nike = new Nike();
        nike.brand();
        nike.lase();
        nike.lase();
        nike.sole();
        nike.price();

        Shoe shoe1 = new Nike();
        shoe1.sole();
        shoe1.price();
        shoe1.brand();
        shoe1.lase();
        shoe1.color();

        Adidas adidas = new Adidas();
        adidas.brand();
        adidas.lase();
        adidas.color();
        adidas.sole();
        adidas.price();

        Shoe shoe2 = new Adidas();
        shoe2.brand();
        shoe2.lase();
        shoe2.color();
        shoe2.sole();
        shoe2.price();

        Sparx sparx = new Sparx();
        sparx.brand();
        sparx.lase();
        sparx.sole();
        sparx.price();
        sparx.color();

        TrafficLight trafficLight=new TrafficLight();
        trafficLight.color();

        RedLight redLight=new RedLight();
        redLight.color();

        TrafficLight trafficLight1=new RedLight();
        trafficLight1.color();

        GreenLight greenLight=new GreenLight();
        greenLight.color();

        TrafficLight trafficLight2=new GreenLight();
        trafficLight2.color();


        SmartPhone smatPhone=new SmartPhone();
        smatPhone.display();
        smatPhone.camera();
        smatPhone.battery();
        smatPhone.brand();
        smatPhone.price();


        Samsung samsung = new Samsung();
        samsung.display();
        samsung.camera();
        samsung.battery();
        samsung.brand();
        samsung.price();

        SmartPhone smatPhone1=new Samsung();
        smatPhone1.display();
        smatPhone1.camera();
        smatPhone1.brand();
        smatPhone1.brand();
        smatPhone1.price();


        Apple apple = new Apple();
        apple.display();
        apple.camera();
        apple.battery();
        apple.brand();
        apple.price();

        OnePlus onePlus = new OnePlus();
        onePlus.display();
        onePlus.camera();
        onePlus.battery();
        onePlus.brand();
        onePlus.price();

        GooglePixel googlePixel = new GooglePixel();
        googlePixel.display();
        googlePixel.camera();
        googlePixel.battery();
        googlePixel.brand();
        googlePixel.price();

        Car car = new Car();
        car.engine();
        car.wheels();
        car.color();
        car.brand();
        car.price();

        Bike bike = new Bike();
        bike.engine();
        bike.wheels();
        bike.color();
        bike.brand();
        bike.price();

        Truck truck = new Truck();
        truck.engine();
        truck.wheels();
        truck.color();
        truck.brand();
        truck.price();

        Watch watch = new SmartWatch();
        watch.time();
        watch.brand();
        watch.battery();
        watch.display();
        watch.price();

        DigitalWatch digitalWatch = new DigitalWatch();
        digitalWatch.time();
        digitalWatch.brand();
        digitalWatch.battery();
        digitalWatch.display();
        digitalWatch.price();

        AnalogWatch analogWatch = new AnalogWatch();
        analogWatch.time();
        analogWatch.brand();
        analogWatch.battery();
        analogWatch.display();
        analogWatch.price();

        SportsWatch sportsWatch = new SportsWatch();
        sportsWatch.time();
        sportsWatch.brand();
        sportsWatch.battery();
        sportsWatch.display();
        sportsWatch.price();

        LuxuryWatch luxuryWatch = new LuxuryWatch();
        luxuryWatch.time();
        luxuryWatch.brand();
        luxuryWatch.battery();
        luxuryWatch.display();
        luxuryWatch.price();

        HybridWatch hybridWatch = new HybridWatch();
        hybridWatch.time();
        hybridWatch.brand();
        hybridWatch.battery();
        hybridWatch.display();
        hybridWatch.price();

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.time();
        smartWatch.brand();
        smartWatch.battery();
        smartWatch.display();
        smartWatch.price();

        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.processor();
        gamingLaptop.ram();
        gamingLaptop.storage();
        gamingLaptop.brand();
        gamingLaptop.price();

        BusinessLaptop businessLaptop = new BusinessLaptop();
        businessLaptop.processor();
        businessLaptop.ram();
        businessLaptop.storage();
        businessLaptop.brand();
        businessLaptop.price();

        Ultrabook ultrabook = new Ultrabook();
        ultrabook.processor();
        ultrabook.ram();
        ultrabook.storage();
        ultrabook.brand();
        ultrabook.price();

        ConvertibleLaptop convertibleLaptop = new ConvertibleLaptop();
        convertibleLaptop.processor();
        convertibleLaptop.ram();
        convertibleLaptop.storage();
        convertibleLaptop.brand();
        convertibleLaptop.price();

        WorkstationLaptop workstationLaptop = new WorkstationLaptop();
        workstationLaptop.processor();
        workstationLaptop.ram();
        workstationLaptop.storage();
        workstationLaptop.brand();
        workstationLaptop.price();

        BudgetLaptop budgetLaptop = new BudgetLaptop();
        budgetLaptop.processor();
        budgetLaptop.ram();
        budgetLaptop.storage();
        budgetLaptop.brand();
        budgetLaptop.price();

        Smartphone smartphone=new Smartphone();
        smartphone.battery();
        smartphone.brand();
        smartphone.call();
        smartphone.price();
        smartphone.camera();

        FeaturePhone featurePhone=new FeaturePhone();
        featurePhone.battery();
        featurePhone.call();
        featurePhone.price();
        featurePhone.brand();
        featurePhone.camera();

        GamingPhone gamingPhone=new GamingPhone();
        gamingPhone.battery();
        gamingPhone.call();
        gamingPhone.price();
        gamingPhone.brand();
        gamingPhone.camera();

        CameraPhone cameraPhone = new CameraPhone();
        cameraPhone.battery();
        cameraPhone.call();
        cameraPhone.price();
        cameraPhone.brand();
        cameraPhone.camera();

        RuggedPhone ruggedPhone = new RuggedPhone();
        ruggedPhone.battery();
        ruggedPhone.call();
        ruggedPhone.price();
        ruggedPhone.brand();
        ruggedPhone.camera();

        FoldablePhone foldablePhone = new FoldablePhone();
        foldablePhone.battery();
        foldablePhone.call();
        foldablePhone.price();
        foldablePhone.brand();
        foldablePhone.camera();

        AndroidTablet androidTablet = new AndroidTablet();
        androidTablet.screenSize();
        androidTablet.storage();
        androidTablet.battery();
        androidTablet.brand();
        androidTablet.price();

        WindowsTablet windowsTablet = new WindowsTablet();
        windowsTablet.screenSize();
        windowsTablet.storage();
        windowsTablet.battery();
        windowsTablet.brand();
        windowsTablet.price();

        ConvertibleTablet convertibleTablet = new ConvertibleTablet();
        convertibleTablet.screenSize();
        convertibleTablet.storage();
        convertibleTablet.battery();
        convertibleTablet.brand();
        convertibleTablet.price();

        DrawingTablet drawingTablet = new DrawingTablet();
        drawingTablet.screenSize();
        drawingTablet.storage();
        drawingTablet.battery();
        drawingTablet.brand();
        drawingTablet.price();

        BudgetTablet budgetTablet = new BudgetTablet();
        budgetTablet.screenSize();
        budgetTablet.storage();
        budgetTablet.battery();
        budgetTablet.brand();
        budgetTablet.price();

        KidsTablet kidsTablet = new KidsTablet();
        kidsTablet.screenSize();
        kidsTablet.storage();
        kidsTablet.battery();
        kidsTablet.brand();
        kidsTablet.price();

        SmartTV smartTV = new SmartTV();
        smartTV.screenSize();
        smartTV.resolution();
        smartTV.brand();
        smartTV.price();

        LEDTV ledTV = new LEDTV();
        ledTV.screenSize();
        ledTV.resolution();
        ledTV.brand();
        ledTV.price();

        OLEDTV oledTV = new OLEDTV();
        oledTV.screenSize();
        oledTV.resolution();
        oledTV.brand();
        oledTV.price();

        PlasmaTV plasmaTV = new PlasmaTV();
        plasmaTV.screenSize();
        plasmaTV.resolution();
        plasmaTV.brand();
        plasmaTV.price();

        SingleDoorRefrigerator singleDoorRefrigerator = new SingleDoorRefrigerator();
        singleDoorRefrigerator.coolingSystem();
        singleDoorRefrigerator.capacity();
        singleDoorRefrigerator.brand();
        singleDoorRefrigerator.price();

        DoubleDoorRefrigerator doubleDoorRefrigerator = new DoubleDoorRefrigerator();
        doubleDoorRefrigerator.coolingSystem();
        doubleDoorRefrigerator.capacity();
        doubleDoorRefrigerator.brand();
        doubleDoorRefrigerator.price();

        SideBySideRefrigerator sideBySideRefrigerator = new SideBySideRefrigerator();
        sideBySideRefrigerator.coolingSystem();
        sideBySideRefrigerator.capacity();
        sideBySideRefrigerator.brand();
        sideBySideRefrigerator.price();

        MiniFridge miniFridge = new MiniFridge();
        miniFridge.coolingSystem();
        miniFridge.capacity();
        miniFridge.brand();
        miniFridge.price();

        SmartFridge smartFridge = new SmartFridge();
        smartFridge.coolingSystem();
        smartFridge.capacity();
        smartFridge.brand();
        smartFridge.price();








    }
}

