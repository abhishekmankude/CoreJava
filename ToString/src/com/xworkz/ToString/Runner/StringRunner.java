package com.xworkz.ToString.Runner;

import com.xworkz.ToString.internal.*;

public class StringRunner {
    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Bag bag = new Bag("American Tourister", "Navy Blue", 30);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bag));
        Bag bag1=new Bag("American Tourister", "Navy Blue", 30);
        System.out.println("they are same"+bag1.equals(bag));
        System.out.println();

        Bank bank = new Bank("SBI", "Mumbai", 500000);
        System.out.println(bank);
        System.out.println(bank.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bank));
        Bank bank1=new Bank("SBI", "Mumbai", 500000);
        System.out.println("they are same"+bank1.equals(bank));
        System.out.println();

        Belt belt = new Belt("Allen Solly", "Medium", 799);
        System.out.println(belt);
        System.out.println(belt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(belt));
        Belt belt1=new Belt("Allen Solly", "Medium", 799);
        System.out.println("they are same"+belt1.equals(belt));
        System.out.println();

        BMTC bmtc = new BMTC("Bengaluru", "Majestic", 25);
        System.out.println(bmtc);
        System.out.println(bmtc.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bmtc));
        BMTC bmtc1=new BMTC("Bengaluru", "Majestic", 25);
        System.out.println("they are same"+bmtc1.equals(bmtc));
        System.out.println();

        Book book = new Book("Navneet", 200, 120);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original Value "+System.identityHashCode(book));
        Book book1=new Book("Navneet", 200, 120);
        System.out.println("they are same"+book1.equals(book));
        System.out.println();

        Bottle bottle = new Bottle("Borosil", "Transparent", 1);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bottle));
        Bottle bottle1=new Bottle("Borosil", "Transparent", 1);
        System.out.println("they are same"+bottle1.equals(bottle));
        System.out.println();

        Browser browser = new Browser("Firefox", "115.0", 2023);
        System.out.println(browser);
        System.out.println(browser.hashCode());
        System.out.println("Original Value "+System.identityHashCode(browser));
        Browser browser1=new Browser("Firefox", "115.0", 2023);
        System.out.println("they are same"+browser1.equals(browser));
        System.out.println();

        Cake cake = new Cake("Theobroma", "Red Velvet", 800);
        System.out.println(cake);
        System.out.println(cake.hashCode());
        System.out.println("Original Value "+System.identityHashCode(cake));
        Cake cake1=new Cake("Theobroma", "Red Velvet", 800);
        System.out.println("they are same"+cake1.equals(cake));
        System.out.println();

        Calender calender = new Calender("2024", "Wildlife", 99);
        System.out.println(calender);
        System.out.println(calender.hashCode());
        System.out.println("Original Value "+System.identityHashCode(calender));
        Calender calender1=new Calender("2024", "Wildlife", 99);
        System.out.println("they are same"+calender1.equals(calender));
        System.out.println();

        Camera camera = new Camera("Nikon", 32, false);
        System.out.println(camera);
        System.out.println(camera.hashCode());
        System.out.println("Original Value "+System.identityHashCode(camera));
        Camera camera1=new Camera("Nikon", 32, false);
        System.out.println("they are same"+camera1.equals(camera));
        System.out.println();

        Cap cap = new Cap("Navy", "Adidas", 799);
        System.out.println(cap);
        System.out.println(cap.hashCode());
        System.out.println("Original Value "+System.identityHashCode(cap));
        Cap cap1=new Cap("Navy", "Adidas", 799);
        System.out.println("they are same"+cap1.equals(cap));
        System.out.println();

        Charger adapter = new Charger("Apple", 20, 1500);
        System.out.println(adapter);
        System.out.println(adapter.hashCode());
        System.out.println("Original Value "+System.identityHashCode(adapter));
        Charger adapter1=new Charger("Apple", 20, 1500);
        System.out.println("they are same"+adapter1.equals(adapter));
        System.out.println();

        Charger battery = new Charger("Li-Polymer", 3, 10);
        System.out.println(battery);
        System.out.println(battery.hashCode());
        System.out.println("Original Value "+System.identityHashCode(battery));
        Charger battery1=new Charger("Li-Polymer", 3, 10);
        System.out.println("they are same"+battery1.equals(battery));
        System.out.println();

        Charger ch = new Charger("OnePlus", 30, 1500);
        System.out.println(ch);
        System.out.println(ch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ch));
        Charger ch1=new Charger("OnePlus", 30, 1500);
        System.out.println("they are same"+ch1.equals(ch));
        System.out.println();

        Chapati chapati = new Chapati("Multigrain", 15, 75);
        System.out.println(chapati);
        System.out.println(chapati.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chapati));
        Chapati chapati1=new Chapati("Multigrain", 15, 75);
        System.out.println("they are same"+chapati1.equals(chapati));
        System.out.println();

        Chappal chappal = new Chappal("Paragon", "L", 499);
        System.out.println(chappal);
        System.out.println(chappal.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chappal));
        Chappal chappal1=new Chappal("Paragon", "L", 499);
        System.out.println("they are same"+chappal1.equals(chappal));
        System.out.println();

        Chess chess = new Chess("Staunton", "ebony", 2500);
        System.out.println(chess);
        System.out.println(chess.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chess));
        Chess chess1=new Chess("plastic","black",1500);
        System.out.println("they are same"+chess.equals(chess1));
        System.out.println();

        ClassRoom classRoom=new ClassRoom("10th","Mangaluru",45);
        System.out.println(classRoom);
        System.out.println(classRoom.hashCode());
        System.out.println("Original Value "+System.identityHashCode(classRoom));
        ClassRoom classRoom1=new ClassRoom("10th","Mangaluru",45);
        System.out.println("they are same"+classRoom1.equals(classRoom));
        System.out.println();

        Clock clock = new Clock("Titan", "Wall", 1299);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original Value "+System.identityHashCode(clock));
        Clock clock1=new Clock("Titan", "Wall", 1299);
        System.out.println("they are same"+clock1.equals(clock));
        System.out.println();

        Coin coin = new Coin("Rupee", "Silver", 1947);
        System.out.println(coin);
        System.out.println(coin.hashCode());
        System.out.println("Original Value "+System.identityHashCode(coin));
        Coin coin1=new Coin("Rupee", "Silver", 1947);
        System.out.println("they are same"+coin1.equals(coin));
        System.out.println();

        Console console = new Console("Xbox Series X", "Microsoft", 49999);
        System.out.println(console);
        System.out.println(console.hashCode());
        System.out.println("Original Value "+System.identityHashCode(console));
        Console console1=new Console("Xbox Series X", "Microsoft", 49999);
        System.out.println("they are same"+console1.equals(console));
        System.out.println();

        CreditCard creditCard = new CreditCard("ICICI", 87654321, 100000);
        System.out.println(creditCard);
        System.out.println(creditCard.hashCode());
        System.out.println("Original Value "+System.identityHashCode(creditCard));
        CreditCard creditCard1=new CreditCard("ICICI", 87654321, 100000);
        System.out.println("they are same"+creditCard1.equals(creditCard));
        System.out.println();

        DiningTable diningTable= new DiningTable("Rectangle", 6, 15000);
        System.out.println(diningTable);
        System.out.println(diningTable.hashCode());
        System.out.println("Original Value "+System.identityHashCode(diningTable));
        DiningTable diningTable1=new DiningTable("Rectangle", 6, 15000);
        System.out.println("they are same"+diningTable1.equals(diningTable));
        System.out.println();

        Door door = new Door("Fiber", 200, 4500);
        System.out.println(door);
        System.out.println(door.hashCode());
        System.out.println("Original Value "+System.identityHashCode(door));
        Door door1=new Door("Fiber", 200, 4500);
        System.out.println("they are same"+door1.equals(door));
        System.out.println();

        Drone drone = new Drone("DJI", "Mavic", 89999);
        System.out.println(drone);
        System.out.println(drone.hashCode());
        System.out.println("Original Value "+System.identityHashCode(drone));
        Drone drone1=new Drone("DJI", "Mavic", 89999);
        System.out.println("they are same"+drone1.equals(drone));
        System.out.println();

        Driver driver = new Driver("Ramesh", "9876543210", 10);
        System.out.println(driver);
        System.out.println(driver.hashCode());
        System.out.println("Original Value "+System.identityHashCode(driver));
        Driver driver1=new Driver("Ramesh", "9876543210", 10);
        System.out.println("they are same"+driver1.equals(driver));
        System.out.println();

        Dustbin bin = new Dustbin("Metal", 20, "Silver");
        System.out.println(bin);
        System.out.println(bin.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bin));
        Dustbin bin1=new Dustbin("Metal", 20, "Silver");
        System.out.println("they are same"+bin1.equals(bin));
        System.out.println();

        Facewash facewash = new Facewash("Garnier", 150, 120);
        System.out.println(facewash);
        System.out.println(facewash.hashCode());
        System.out.println("Original Value "+System.identityHashCode(facewash));
        Facewash facewash1=new Facewash("Garnier", 150, 120);
        System.out.println("they are same"+facewash1.equals(facewash));
        System.out.println();

        Fan fan = new Fan("Tower", 1200, 80);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original Value "+System.identityHashCode(fan));
        Fan fan1=new Fan("Tower", 1200, 80);
        System.out.println("they are same"+fan1.equals(fan));
        System.out.println();

        Fridge fridge = new Fridge("Whirlpool", 250, 35000);
        System.out.println(fridge);
        System.out.println(fridge.hashCode());
        System.out.println("Original Value "+System.identityHashCode(fridge));
        Fridge fridge1=new Fridge("Whirlpool", 250, 35000);
        System.out.println("they are same"+fridge1.equals(fridge));
        System.out.println();

        Guitar guitar = new Guitar("Acoustic", "Fender", 12000);
        System.out.println(guitar);
        System.out.println(guitar.hashCode());
        System.out.println("Original Value "+System.identityHashCode(guitar));
        Guitar guitar1=new Guitar("Acoustic", "Fender", 12000);
        System.out.println("they are same"+guitar1.equals(guitar));
        System.out.println();

        HeadPhone headPhone = new HeadPhone("Sony", "Over-ear", 2999);
        System.out.println(headPhone);
        System.out.println(headPhone.hashCode());
        System.out.println("Original Value "+System.identityHashCode(headPhone));
        HeadPhone headPhone1=new HeadPhone("Sony", "Over-ear", 2999);
        System.out.println("they are same"+headPhone1.equals(headPhone));
        System.out.println();

        Helmet helmet = new Helmet("Studds", "L", "Black");
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(helmet));
        Helmet helmet1=new Helmet("Studds", "L", "Black");
        System.out.println("they are same"+helmet1.equals(helmet));
        System.out.println();

        IceCream icecream = new IceCream("Kwality Walls", "Chocolate", 100);
        System.out.println(icecream);
        System.out.println(icecream.hashCode());
        System.out.println("Original Value "+System.identityHashCode(icecream));
        IceCream icecream1=new IceCream("Kwality Walls", "Chocolate", 100);
        System.out.println("they are same"+icecream1.equals(icecream));
        System.out.println();

        Ipl ipl = new Ipl("Mumbai Indians", "Rohit Sharma", 5);
        System.out.println(ipl);
        System.out.println(ipl.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ipl));
        Ipl ipl1=new Ipl("Mumbai Indians", "Rohit Sharma", 5);
        System.out.println("they are same"+ipl1.equals(ipl));
        System.out.println();

        IronBox ironBox = new IronBox("Bajaj", 1000, 1299);
        System.out.println(ironBox);
        System.out.println(ironBox.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ironBox));
        IronBox ironBox1=new IronBox("Bajaj", 1000, 1299);
        System.out.println("they are same"+ironBox1.equals(ironBox));
        System.out.println();

        Jet jet = new Jet("Boeing 747", 900, 2);
        System.out.println(jet);
        System.out.println(jet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(jet));
        Jet jet1=new Jet("Boeing 747", 900, 2);
        System.out.println("they are same"+jet1.equals(jet));
        System.out.println();

        Jug jug=new Jug("Red",2,"rectangle");
        System.out.println(jug);
        System.out.println(jug.hashCode());
        System.out.println("Original Value "+System.identityHashCode(jug));
        Jug jug1=new Jug("Red",2,"rectangle");
        System.out.println("they are same"+jug1.equals(jug));
        System.out.println();

        KeyBoard keyBoard = new KeyBoard("Logitech", 104, 899);
        System.out.println(keyBoard);
        System.out.println(keyBoard.hashCode());
        System.out.println("Original Value "+System.identityHashCode(keyBoard));
        KeyBoard keyBoard1=new KeyBoard("Logitech", 104, 899);
        System.out.println("they are same"+keyBoard1.equals(keyBoard));
        System.out.println();

        Lamp lamp = new Lamp("Table", "warm white", 499);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("Original Value "+System.identityHashCode(lamp));
        Lamp lamp1=new Lamp("Table", "warm white", 499);
        System.out.println("they are same"+lamp1.equals(lamp));
        System.out.println();

        Language language = new Language("Kannada", "Bangalore", 5000);
        System.out.println(language);
        System.out.println(language.hashCode());
        System.out.println("Original Value "+System.identityHashCode(language));
        Language language1=new Language("Kannada", "Bangalore", 5000);
        System.out.println("they are same"+language1.equals(language));
        System.out.println();

        Laptop laptop = new Laptop("Dell", "i5", 45000);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("Original Value "+System.identityHashCode(laptop));
        Laptop laptop1=new Laptop("Dell", "i5", 45000);
        System.out.println("they are same"+laptop1.equals(laptop));
        System.out.println();

        Light light = new Light("Havells", "LED", 300);
        System.out.println(light);
        System.out.println(light.hashCode());
        System.out.println("Original Value "+System.identityHashCode(light));
        Light light1=new Light("Havells", "LED", 300);
        System.out.println("they are same"+light1.equals(light));
        System.out.println();

        LunchBox box = new LunchBox("Milton", 2, 450);
        System.out.println(box);
        System.out.println(box.hashCode());
        System.out.println("Original Value "+System.identityHashCode(box));
        LunchBox box1=new LunchBox("Milton", 2, 450);
        System.out.println("they are same"+box1.equals(box));
        System.out.println();

        Malleshwaram malleshwaram=new Malleshwaram("Dress","Pant",1100);
        System.out.println(malleshwaram);
        System.out.println(malleshwaram.hashCode());
        System.out.println("Original Value "+System.identityHashCode(malleshwaram));
        Malleshwaram malleshwaram1=new Malleshwaram("Dress","Pant",1100);
        System.out.println("they are same"+malleshwaram1.equals(malleshwaram));
        System.out.println();

        Mat mat = new Mat("Yoga", "Blue", 6);
        System.out.println(mat);
        System.out.println(mat.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mat));
        Mat mat1=new Mat("Yoga", "Blue", 6);
        System.out.println("they are same"+mat1.equals(mat));
        System.out.println();

        Marker marker = new Marker("Black", "Camlin", 25);
        System.out.println(marker);
        System.out.println(marker.hashCode());
        System.out.println("Original Value "+System.identityHashCode(marker));
        Marker marker1=new Marker("Black", "Camlin", 25);
        System.out.println("they are same"+marker1.equals(marker));
        System.out.println();

        Metro metro = new Metro("Delhi", "Yellow", 15);
        System.out.println(metro);
        System.out.println(metro.hashCode());
        System.out.println("Original Value "+System.identityHashCode(metro));
        Metro metro1=new Metro("Delhi", "Yellow", 15);
        System.out.println("they are same"+metro1.equals(metro));
        System.out.println();

        Milk milk = new Milk("Amul", 1, 50);
        System.out.println(milk);
        System.out.println(milk.hashCode());
        System.out.println("Original Value "+System.identityHashCode(milk));
        Milk milk1=new Milk("Amul", 1, 50);
        System.out.println("they are same"+milk1.equals(milk));
        System.out.println();

        Mixer mixer = new Mixer("Bajaj", 5, 2499);
        System.out.println(mixer);
        System.out.println(mixer.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mixer));
        Mixer mixer1=new Mixer("Bajaj", 5, 2499);
        System.out.println("they are same"+mixer1.equals(mixer));
        System.out.println();

        Mobile mobile = new Mobile("Samsung", "Galaxy M32", 15999);
        System.out.println(mobile);
        System.out.println(mobile.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mobile));
        Mobile mobile1=new Mobile("Samsung", "Galaxy M32", 15999);
        System.out.println("they are same"+mobile1.equals(mobile));
        System.out.println();

        Money atm = new Money("ICICI", "Delhi", 20000);
        System.out.println(atm);
        System.out.println(atm.hashCode());
        System.out.println("Original Value "+System.identityHashCode(atm));
        Money atm1=new Money("ICICI", "Delhi", 20000);
        System.out.println("they are same"+atm1.equals(atm));
        System.out.println();

        Money money = new Money("USD", "United States", 50);
        System.out.println(money);
        System.out.println(money.hashCode());
        System.out.println("Original Value "+System.identityHashCode(money));
        Money money1=new Money("USD", "United States", 50);
        System.out.println("they are same"+money1.equals(money));
        System.out.println();

        Mouse mouse = new Mouse("Logitech", "Wireless", 599);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mouse));
        Mouse mouse1=new Mouse("Logitech", "Wireless", 599);
        System.out.println("they are same"+mouse1.equals(mouse));
        System.out.println();

        Mug mug = new Mug("Porcelain", "White", 199);
        System.out.println(mug);
        System.out.println(mug.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mug));
        Mug mug1=new Mug("Porcelain", "White", 199);
        System.out.println("they are same"+mug1.equals(mug));
        System.out.println();

        NoteBook noteBook = new NoteBook("Classmate", 120, "A4");
        System.out.println(noteBook);
        System.out.println(noteBook.hashCode());
        System.out.println("Original Value "+System.identityHashCode(noteBook));
        NoteBook noteBook1=new NoteBook("Classmate", 120, "A4");
        System.out.println("they are same"+noteBook1.equals(noteBook));
        System.out.println();

        Ocean ocean = new Ocean("Atlantic", 8486, 106460000);
        System.out.println(ocean);
        System.out.println(ocean.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ocean));
        Ocean ocean1=new Ocean("Atlantic", 8486, 106460000);
        System.out.println("they are same"+ocean1.equals(ocean));
        System.out.println();

        Oven oven = new Oven("Microwave", 25, 8999);
        System.out.println(oven);
        System.out.println(oven.hashCode());
        System.out.println("Original Value "+System.identityHashCode(oven));
        Oven oven1=new Oven("Microwave", 25, 8999);
        System.out.println("they are same"+oven1.equals(oven));
        System.out.println();

        Pant pant = new Pant("Levi's", "black", 2499);
        System.out.println(pant);
        System.out.println(pant.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pant));
        Pant pant1=new Pant("Levi's", "black", 2499);
        System.out.println("they are same"+pant1.equals(pant));
        System.out.println();

        Park park = new Park("Cubbon Park", "Central Bangalore", 3000);
        System.out.println(park);
        System.out.println(park.hashCode());
        System.out.println("Original Value "+System.identityHashCode(park));
        Park park1=new Park("Cubbon Park", "Central Bangalore", 3000);
        System.out.println("they are same"+park1.equals(park));
        System.out.println();

        Pen pen = new Pen("Parker", "black", 150);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pen));
        Pen pen1=new Pen("Parker", "black", 150);
        System.out.println("they are same"+pen1.equals(pen));
        System.out.println();

        Pencil pencil = new Pencil("Apsara", "HB", 10);
        System.out.println(pencil);
        System.out.println(pencil.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pencil));
        Pencil pencil1=new Pencil("Apsara", "HB", 10);
        System.out.println("they are same"+pencil1.equals(pencil));
        System.out.println();

        PetrolPump petrolPump = new PetrolPump("HP", "Highway", 102);
        System.out.println(petrolPump);
        System.out.println(petrolPump.hashCode());
        System.out.println("Original Value "+System.identityHashCode(petrolPump));
        PetrolPump petrolPump1=new PetrolPump("HP", "Highway", 102);
        System.out.println("they are same"+petrolPump1.equals(petrolPump));
        System.out.println();

        Pharmacy pharmacy = new Pharmacy("Apollo", "MG Road", 5);
        System.out.println(pharmacy);
        System.out.println(pharmacy.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pharmacy));
        Pharmacy pharmacy1=new Pharmacy("Apollo", "MG Road", 5);
        System.out.println("they are same"+pharmacy1.equals(pharmacy));
        System.out.println();

        Plate plate = new Plate("Ceramic", 30, 199);
        System.out.println(plate);
        System.out.println(plate.hashCode());
        System.out.println("Original Value "+System.identityHashCode(plate));
        Plate plate1=new Plate("Ceramic", 30, 199);
        System.out.println("they are same"+plate1.equals(plate));
        System.out.println();

        Port port = new Port("HDMI", 2, 300);
        System.out.println(port);
        System.out.println(port.hashCode());
        System.out.println("Original Value "+System.identityHashCode(port));
        Port port1=new Port("HDMI", 2, 300);
        System.out.println("they are same"+port1.equals(port));
        System.out.println();

        PowerBank powerBank = new PowerBank("Mi", 10000, 999);
        System.out.println(powerBank);
        System.out.println(powerBank.hashCode());
        System.out.println("Original Value "+System.identityHashCode(powerBank));
        PowerBank powerBank1=new PowerBank("Mi", 10000, 999);
        System.out.println("they are same"+powerBank1.equals(powerBank));
        System.out.println();

        Printer printer = new Printer("Canon", false, 30);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        System.out.println("Original Value "+System.identityHashCode(printer));
        Printer printer1=new Printer("Canon", false, 30);
        System.out.println("they are same"+printer1.equals(printer));
        System.out.println();

        Remote remote = new Remote("LG", "silver", 350);
        System.out.println(remote);
        System.out.println(remote.hashCode());
        System.out.println("Original Value "+System.identityHashCode(remote));
        Remote remote1=new Remote("LG", "silver", 350);
        System.out.println("they are same"+remote1.equals(remote));
        System.out.println();

        Rice rice = new Rice("Sona Masoori", 10, 600);
        System.out.println(rice);
        System.out.println(rice.hashCode());
        System.out.println("Original Value "+System.identityHashCode(rice));
        Rice rice1=new Rice("Sona Masoori", 10, 600);
        System.out.println("they are same"+rice1.equals(rice));
        System.out.println();

        Ruler ruler = new Ruler(15, "Metal", 50);
        System.out.println(ruler);
        System.out.println(ruler.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ruler));
        Ruler ruler1=new Ruler(15, "Metal", 50);
        System.out.println("they are same"+ruler1.equals(ruler));
        System.out.println();

        Samosa samosa = new Samosa("Haldiram's", "Pyramid", 20);
        System.out.println(samosa);
        System.out.println(samosa.hashCode());
        System.out.println("Original Value "+System.identityHashCode(samosa));
        Samosa samosa1=new Samosa("Haldiram's", "Pyramid", 20);
        System.out.println("they are same"+samosa1.equals(samosa));
        System.out.println();

        Scooter scooter = new Scooter("TVS", "Jupiter", 85000);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());
        System.out.println("Original Value "+System.identityHashCode(scooter));
        Scooter scooter1=new Scooter("TVS", "Jupiter", 85000);
        System.out.println("they are same"+scooter1.equals(scooter));
        System.out.println();

        Shampoo shampoo = new Shampoo("Pantene", 200, "Smooth");
        System.out.println(shampoo);
        System.out.println(shampoo.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shampoo));
        Shampoo shampoo1=new Shampoo("Pantene", 200, "Smooth");
        System.out.println("they are same"+shampoo1.equals(shampoo));
        System.out.println();

        Shirt shirt = new Shirt("Peter England", "blue", 1599);
        System.out.println(shirt);
        System.out.println(shirt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shirt));
        Shirt shirt1=new Shirt("Peter England", "blue", 1599);
        System.out.println("they are same"+shirt1.equals(shirt));
        System.out.println();

        Shoe shoe = new Shoe("Nike", 10, 3499);
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shoe));
        Shoe shoe1=new Shoe("Nike", 10, 3499);
        System.out.println("they are same"+shoe1.equals(shoe));
        System.out.println();

        Soap soap = new Soap("Dove", "Beauty Bar", 45);
        System.out.println(soap);
        System.out.println(soap.hashCode());
        System.out.println("Original Value "+System.identityHashCode(soap));
        Soap soap1=new Soap("Dove", "Beauty Bar", 45);
        System.out.println("they are same"+soap1.equals(soap));
        System.out.println();

        Socks socks = new Socks("Puma", "white", 199);
        System.out.println(socks);
        System.out.println(socks.hashCode());
        System.out.println("Original Value "+System.identityHashCode(socks));
        Socks socks1=new Socks("Puma", "white", 199);
        System.out.println("they are same"+socks1.equals(socks));
        System.out.println();

        Sofa sofa = new Sofa("Fabric", 5, 15000);
        System.out.println(sofa);
        System.out.println(sofa.hashCode());
        System.out.println("Original Value "+System.identityHashCode(sofa));
        Sofa sofa1=new Sofa("Fabric", 5, 15000);
        System.out.println("they are same"+sofa1.equals(sofa));
        System.out.println();

        Speaker speaker = new Speaker("Bose", "Bluetooth", 5999);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println("Original Value "+System.identityHashCode(speaker));
        Speaker speaker1=new Speaker("Bose", "Bluetooth", 5999);
        System.out.println("they are same"+speaker1.equals(speaker));
        System.out.println();

        Stand stand = new Stand("Metal", "black", 999);
        System.out.println(stand);
        System.out.println(stand.hashCode());
        System.out.println("Original Value "+System.identityHashCode(stand));
        Stand stand1=new Stand("Metal", "black", 999);
        System.out.println("they are same"+stand1.equals(stand));
        System.out.println();

        Star star = new Star("Polaris", 6000, 5);
        System.out.println(star);
        System.out.println(star.hashCode());
        System.out.println("Original Value "+System.identityHashCode(star));
        Star star1=new Star("Polaris", 6000, 5);
        System.out.println("they are same"+star1.equals(star));
        System.out.println();

        Stapler stapler = new Stapler("Butterfly", 50, 120);
        System.out.println(stapler);
        System.out.println(stapler.hashCode());
        System.out.println("Original Value "+System.identityHashCode(stapler));
        Stapler stapler1=new Stapler("Butterfly", 50, 120);
        System.out.println("they are same"+stapler1.equals(stapler));
        System.out.println();

        SunGlasses sunGlasses = new SunGlasses("Ray-Ban", "Aviator", 5999);
        System.out.println(sunGlasses);
        System.out.println(sunGlasses.hashCode());
        System.out.println("Original Value "+System.identityHashCode(sunGlasses));
        SunGlasses sunGlasses1=new SunGlasses("Ray-Ban", "Aviator", 5999);
        System.out.println("they are same"+sunGlasses1.equals(sunGlasses));
        System.out.println();

        Table table = new Table("Dining", "Wooden", 12000);
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("Original Value "+System.identityHashCode(table));
        Table table1=new Table("Dining", "Wooden", 12000);
        System.out.println("they are same"+table1.equals(table));
        System.out.println();

        Ticket ticket = new Ticket("Coldplay Concert", "15/12", 5000);
        System.out.println(ticket);
        System.out.println(ticket.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ticket));
        Ticket ticket1=new Ticket("Coldplay Concert", "15/12", 5000);
        System.out.println("they are same"+ticket1.equals(ticket));
        System.out.println();

        ToothPaste toothPaste = new ToothPaste("Pepsodent", "Mint", 75);
        System.out.println(toothPaste);
        System.out.println(toothPaste.hashCode());
        System.out.println("Original Value "+System.identityHashCode(toothPaste));
        ToothPaste toothPaste1=new ToothPaste("Pepsodent", "Mint", 75);
        System.out.println("they are same"+toothPaste1.equals(toothPaste));
        System.out.println();

        Torch torch = new Torch("Eveready", 500, 199);
        System.out.println(torch);
        System.out.println(torch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(torch));
        Torch torch1=new Torch("Eveready", 500, 199);
        System.out.println("they are same"+torch1.equals(torch));
        System.out.println();

        ToyCar toyCar = new ToyCar("Red", "Matchbox", 99);
        System.out.println(toyCar);
        System.out.println(toyCar.hashCode());
        System.out.println("Original Value "+System.identityHashCode(toyCar));
        ToyCar toyCar1=new ToyCar("Red", "Matchbox", 99);
        System.out.println("they are same"+toyCar1.equals(toyCar));
        System.out.println();


        Towel towel = new Towel("Microfiber", "Beige", 299);
        System.out.println(towel);
        System.out.println(towel.hashCode());
        System.out.println("Original Value "+System.identityHashCode(towel));
        Towel towel1 = new Towel("Microfiber", "Beige", 299);
        System.out.println("they are same "+towel1.equals(towel));
        System.out.println();

        Tripod tripod = new Tripod("Carbon Fiber", 180, 2500);
        System.out.println(tripod);
        System.out.println(tripod.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tripod));
        Tripod tripod1 = new Tripod("Carbon Fiber", 180, 2500);
        System.out.println("they are same "+tripod1.equals(tripod));
        System.out.println();

        Tshirt tshirt = new Tshirt("Adidas", "black", 1999);
        System.out.println(tshirt);
        System.out.println(tshirt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tshirt));
        Tshirt tshirt1 = new Tshirt("Adidas", "black", 1999);
        System.out.println("they are same "+tshirt1.equals(tshirt));
        System.out.println();

        TV tv = new TV("Sony", 32, 22000);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tv));
        TV tv1 = new TV("Sony", 32, 22000);
        System.out.println("they are same "+tv1.equals(tv));
        System.out.println();

        Umbrella umbrella = new Umbrella("Black", 55, 499);
        System.out.println(umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println("Original Value "+System.identityHashCode(umbrella));
        Umbrella umbrella1 = new Umbrella("Black", 55, 499);
        System.out.println("they are same "+umbrella1.equals(umbrella));
        System.out.println();

        USB usb = new USB("Samsung", 128, "USB 3.1");
        System.out.println(usb);
        System.out.println(usb.hashCode());
        System.out.println("Original Value "+System.identityHashCode(usb));
        USB usb1 = new USB("Samsung", 128, "USB 3.1");
        System.out.println("they are same "+usb1.equals(usb));
        System.out.println();

        Wallet wallet = new Wallet("Wildcraft", "Nylon", 999);
        System.out.println(wallet);
        System.out.println(wallet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(wallet));
        Wallet wallet1 = new Wallet("Wildcraft", "Nylon", 999);
        System.out.println("they are same "+wallet1.equals(wallet));
        System.out.println();

        Watch watch = new Watch("Casio", "Digital", 1999);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(watch));
        Watch watch1 = new Watch("Casio", "Digital", 1999);
        System.out.println("they are same "+watch1.equals(watch));
        System.out.println();

        Wire wire = new Wire("Aluminum", 15, "Black");
        System.out.println(wire);
        System.out.println(wire.hashCode());
        System.out.println("Original Value "+System.identityHashCode(wire));
        Wire wire1 = new Wire("Aluminum", 15, "Black");
        System.out.println("they are same "+wire1.equals(wire));
        System.out.println();

        WoodenBox woodenBox = new WoodenBox("Teak", "rectangular", 2);
        System.out.println(woodenBox);
        System.out.println(woodenBox.hashCode());
        System.out.println("Original Value "+System.identityHashCode(woodenBox));
        WoodenBox woodenBox1 = new WoodenBox("Teak", "rectangular", 2);
        System.out.println("they are same "+woodenBox1.equals(woodenBox));
        System.out.println();

        Zeebra zeebra = new Zeebra("Bannerghatta", "Rahul", 75);
        System.out.println(zeebra);
        System.out.println(zeebra.hashCode());
        System.out.println("Original Value "+System.identityHashCode(zeebra));
        Zeebra zeebra1 = new Zeebra("Bannerghatta", "Rahul", 75);
        System.out.println("they are same "+zeebra1.equals(zeebra));
        System.out.println();






    }
}
