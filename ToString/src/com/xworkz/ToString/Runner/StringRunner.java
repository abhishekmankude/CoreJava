package com.xworkz.ToString.Runner;

import com.xworkz.ToString.internal.*;

public class StringRunner {
    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Avocado avacado = new Avocado("Hass", 150, 100);
        System.out.println(avacado);
        System.out.println(avacado.hashCode());
        System.out.println("Original Value "+System.identityHashCode(avacado));
        Avocado avocado1=new Avocado("Hass",150,100);
        System.out.println("they are same"+avocado1.equals(avacado));


        System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Bag bag = new Bag("American Tourister", "Navy Blue", 30);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bag));
        System.out.println();

        Bank bank = new Bank("SBI", "Mumbai", 500000);
        System.out.println(bank);
        System.out.println(bank.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bank));
        System.out.println();

        Belt belt = new Belt("Allen Solly", "Medium", 799);
        System.out.println(belt);
        System.out.println(belt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(belt));
        System.out.println();

        BMTC bmtc = new BMTC("Bengaluru", "Majestic", 25);
        System.out.println(bmtc);
        System.out.println(bmtc.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bmtc));
        System.out.println();

        Book book = new Book("Navneet", 200, 120);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original Value "+System.identityHashCode(book));
        System.out.println();

        Bottle bottle = new Bottle("Borosil", "Transparent", 1);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bottle));
        System.out.println();

        Browser browser = new Browser("Firefox", "115.0", 2023);
        System.out.println(browser);
        System.out.println(browser.hashCode());
        System.out.println("Original Value "+System.identityHashCode(browser));
        System.out.println();

        Cake cake = new Cake("Theobroma", "Red Velvet", 800);
        System.out.println(cake);
        System.out.println(cake.hashCode());
        System.out.println("Original Value "+System.identityHashCode(cake));
        System.out.println();

        Calender calender = new Calender("2024", "Wildlife", 99);
        System.out.println(calender);
        System.out.println(calender.hashCode());
        System.out.println("Original Value "+System.identityHashCode(calender));
        System.out.println();

        Camera camera = new Camera("Nikon", 32, false);
        System.out.println(camera);
        System.out.println(camera.hashCode());
        System.out.println("Original Value "+System.identityHashCode(camera));
        System.out.println();

        Cap cap = new Cap("Navy", "Adidas", 799);
        System.out.println(cap);
        System.out.println(cap.hashCode());
        System.out.println("Original Value "+System.identityHashCode(cap));
        System.out.println();

        Charger adapter = new Charger("Apple", 20, 1500);
        System.out.println(adapter);
        System.out.println(adapter.hashCode());
        System.out.println("Original Value "+System.identityHashCode(adapter));
        System.out.println();

        Charger battery = new Charger("Li-Polymer", 3, 10);
        System.out.println(battery);
        System.out.println(battery.hashCode());
        System.out.println("Original Value "+System.identityHashCode(battery));
        System.out.println();

        Charger ch = new Charger("OnePlus", 30, 1500);
        System.out.println(ch);
        System.out.println(ch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ch));
        System.out.println();

        Chapati chapati = new Chapati("Multigrain", 15, 75);
        System.out.println(chapati);
        System.out.println(chapati.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chapati));
        System.out.println();

        Chappal chappal = new Chappal("Paragon", "L", 499);
        System.out.println(chappal);
        System.out.println(chappal.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chappal));
        System.out.println();

        Chess chess = new Chess("Staunton", "ebony", 2500);
        System.out.println(chess);
        System.out.println(chess.hashCode());
        System.out.println("Original Value "+System.identityHashCode(chess));
        Chess chess1=new Chess("plastic","black",1500);
        System.out.println(chess.equals(chess1));
        System.out.println();

        ClassRoom classRoom=new ClassRoom("10th","Mangaluru",45);
        System.out.println(classRoom);
        System.out.println(classRoom.hashCode());
        System.out.println("Original Value "+System.identityHashCode(classRoom));
        System.out.println();

        Clock clock = new Clock("Titan", "Wall", 1299);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original Value "+System.identityHashCode(clock));
        System.out.println();

        Coin coin = new Coin("Rupee", "Silver", 1947);
        System.out.println(coin);
        System.out.println(coin.hashCode());
        System.out.println("Original Value "+System.identityHashCode(coin));
        System.out.println();

        Console console = new Console("Xbox Series X", "Microsoft", 49999);
        System.out.println(console);
        System.out.println(console.hashCode());
        System.out.println("Original Value "+System.identityHashCode(console));
        System.out.println();

        CreditCard creditCard = new CreditCard("ICICI", 87654321, 100000);
        System.out.println(creditCard);
        System.out.println(creditCard.hashCode());
        System.out.println("Original Value "+System.identityHashCode(creditCard));
        System.out.println();

        DiningTable diningTable= new DiningTable("Rectangle", 6, 15000);
        System.out.println(diningTable);
        System.out.println(diningTable.hashCode());
        System.out.println("Original Value "+System.identityHashCode(diningTable));
        System.out.println();

        Door door = new Door("Fiber", 200, 4500);
        System.out.println(door);
        System.out.println(door.hashCode());
        System.out.println("Original Value "+System.identityHashCode(door));
        System.out.println();

        Drone drone = new Drone("DJI", "Mavic", 89999);
        System.out.println(drone);
        System.out.println(drone.hashCode());
        System.out.println("Original Value "+System.identityHashCode(drone));
        System.out.println();

        Driver driver = new Driver("Ramesh", "9876543210", 10);
        System.out.println(driver);
        System.out.println(driver.hashCode());
        System.out.println("Original Value "+System.identityHashCode(driver));
        System.out.println();

        Dustbin bin = new Dustbin("Metal", 20, "Silver");
        System.out.println(bin);
        System.out.println(bin.hashCode());
        System.out.println("Original Value "+System.identityHashCode(bin));
        System.out.println();

        Facewash facewash = new Facewash("Garnier", 150, 120);
        System.out.println(facewash);
        System.out.println(facewash.hashCode());
        System.out.println("Original Value "+System.identityHashCode(facewash));
        System.out.println();

        Fan fan = new Fan("Tower", 1200, 80);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original Value "+System.identityHashCode(fan));
        System.out.println();

        Fridge fridge = new Fridge("Whirlpool", 250, 35000);
        System.out.println(fridge);
        System.out.println(fridge.hashCode());
        System.out.println("Original Value "+System.identityHashCode(fridge));
        System.out.println();

        Guitar guitar = new Guitar("Acoustic", "Fender", 12000);
        System.out.println(guitar);
        System.out.println(guitar.hashCode());
        System.out.println("Original Value "+System.identityHashCode(guitar));
        System.out.println();

        HeadPhone headPhone = new HeadPhone("Sony", "Over-ear", 2999);
        System.out.println(headPhone);
        System.out.println(headPhone.hashCode());
        System.out.println("Original Value "+System.identityHashCode(headPhone));
        System.out.println();

        Helmet helmet = new Helmet("Studds", "L", "Black");
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(helmet));
        System.out.println();

        IceCream icecream = new IceCream("Kwality Walls", "Chocolate", 100);
        System.out.println(icecream);
        System.out.println(icecream.hashCode());
        System.out.println("Original Value "+System.identityHashCode(icecream));
        System.out.println();

        Ipl ipl = new Ipl("Mumbai Indians", "Rohit Sharma", 5);
        System.out.println(ipl);
        System.out.println(ipl.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ipl));
        System.out.println();

        IronBox ironBox = new IronBox("Bajaj", 1000, 1299);
        System.out.println(ironBox);
        System.out.println(ironBox.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ironBox));
        System.out.println();

        Jet jet = new Jet("Boeing 747", 900, 2);
        System.out.println(jet);
        System.out.println(jet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(jet));
        System.out.println();

        Jug jug=new Jug("Red",2,"rectangle");
        System.out.println(jug);
        System.out.println(jug.hashCode());
        System.out.println("Original Value "+System.identityHashCode(jug));
        System.out.println();

        KeyBoard keyBoard = new KeyBoard("Logitech", 104, 899);
        System.out.println(keyBoard);
        System.out.println(keyBoard.hashCode());
        System.out.println("Original Value "+System.identityHashCode(keyBoard));
        System.out.println();

        Lamp lamp = new Lamp("Table", "warm white", 499);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("Original Value "+System.identityHashCode(lamp));
        System.out.println();

        Language language = new Language("Kannada", "Bangalore", 5000);
        System.out.println(language);
        System.out.println(language.hashCode());
        System.out.println("Original Value "+System.identityHashCode(language));
        System.out.println();

        Laptop laptop = new Laptop("Dell", "i5", 45000);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("Original Value "+System.identityHashCode(laptop));
        System.out.println();

        Light light = new Light("Havells", "LED", 300);
        System.out.println(light);
        System.out.println(light.hashCode());
        System.out.println("Original Value "+System.identityHashCode(light));
        System.out.println();

        LunchBox box = new LunchBox("Milton", 2, 450);
        System.out.println(box);
        System.out.println(box.hashCode());
        System.out.println("Original Value "+System.identityHashCode(box));
        System.out.println();

        Malleshwaram malleshwaram=new Malleshwaram("Dress","Pant",1100);
        System.out.println(malleshwaram);
        System.out.println(malleshwaram.hashCode());
        System.out.println("Original Value "+System.identityHashCode(malleshwaram));
        System.out.println();

        Mat mat = new Mat("Yoga", "Blue", 6);
        System.out.println(mat);
        System.out.println(mat.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mat));
        System.out.println();

        Marker marker = new Marker("Black", "Camlin", 25);
        System.out.println(marker);
        System.out.println(marker.hashCode());
        System.out.println("Original Value "+System.identityHashCode(marker));
        System.out.println();

        Metro metro = new Metro("Delhi", "Yellow", 15);
        System.out.println(metro);
        System.out.println(metro.hashCode());
        System.out.println("Original Value "+System.identityHashCode(metro));
        System.out.println();

        Milk milk = new Milk("Amul", 1, 50);
        System.out.println(milk);
        System.out.println(milk.hashCode());
        System.out.println("Original Value "+System.identityHashCode(milk));
        System.out.println();

        Mixer mixer = new Mixer("Bajaj", 5, 2499);
        System.out.println(mixer);
        System.out.println(mixer.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mixer));
        System.out.println();

        Mobile mobile = new Mobile("Samsung", "Galaxy M32", 15999);
        System.out.println(mobile);
        System.out.println(mobile.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mobile));
        System.out.println();

        Money atm = new Money("ICICI", "Delhi", 20000);
        System.out.println(atm);
        System.out.println(atm.hashCode());
        System.out.println("Original Value "+System.identityHashCode(atm));
        System.out.println();

        Money money = new Money("USD", "United States", 50);
        System.out.println(money);
        System.out.println(money.hashCode());
        System.out.println("Original Value "+System.identityHashCode(money));
        System.out.println();

        Mouse mouse = new Mouse("Logitech", "Wireless", 599);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mouse));
        System.out.println();

        Mug mug = new Mug("Porcelain", "White", 199);
        System.out.println(mug);
        System.out.println(mug.hashCode());
        System.out.println("Original Value "+System.identityHashCode(mug));
        System.out.println();

        NoteBook noteBook = new NoteBook("Classmate", 120, "A4");
        System.out.println(noteBook);
        System.out.println(noteBook.hashCode());
        System.out.println("Original Value "+System.identityHashCode(noteBook));
        System.out.println();

        Ocean ocean = new Ocean("Atlantic", 8486, 106460000);
        System.out.println(ocean);
        System.out.println(ocean.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ocean));
        System.out.println();

        Oven oven = new Oven("Microwave", 25, 8999);
        System.out.println(oven);
        System.out.println(oven.hashCode());
        System.out.println("Original Value "+System.identityHashCode(oven));
        System.out.println();

        Pant pant = new Pant("Levi's", "black", 2499);
        System.out.println(pant);
        System.out.println(pant.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pant));
        System.out.println();

        Park park = new Park("Cubbon Park", "Central Bangalore", 3000);
        System.out.println(park);
        System.out.println(park.hashCode());
        System.out.println("Original Value "+System.identityHashCode(park));
        System.out.println();

        Pen pen = new Pen("Parker", "black", 150);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pen));
        System.out.println();

        Pencil pencil = new Pencil("Apsara", "HB", 10);
        System.out.println(pencil);
        System.out.println(pencil.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pencil));
        System.out.println();

        PetrolPump petrolPump = new PetrolPump("HP", "Highway", 102);
        System.out.println(petrolPump);
        System.out.println(petrolPump.hashCode());
        System.out.println("Original Value "+System.identityHashCode(petrolPump));
        System.out.println();

        Pharmacy pharmacy = new Pharmacy("Apollo", "MG Road", 5);
        System.out.println(pharmacy);
        System.out.println(pharmacy.hashCode());
        System.out.println("Original Value "+System.identityHashCode(pharmacy));
        System.out.println();

        Plate plate = new Plate("Ceramic", 30, 199);
        System.out.println(plate);
        System.out.println(plate.hashCode());
        System.out.println("Original Value "+System.identityHashCode(plate));
        System.out.println();

        Port port = new Port("HDMI", 2, 300);
        System.out.println(port);
        System.out.println(port.hashCode());
        System.out.println("Original Value "+System.identityHashCode(port));
        System.out.println();

        PowerBank powerBank = new PowerBank("Mi", 10000, 999);
        System.out.println(powerBank);
        System.out.println(powerBank.hashCode());
        System.out.println("Original Value "+System.identityHashCode(powerBank));
        System.out.println();

        Printer printer = new Printer("Canon", false, 30);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        System.out.println("Original Value "+System.identityHashCode(printer));
        System.out.println();

        Remote remote = new Remote("LG", "silver", 350);
        System.out.println(remote);
        System.out.println(remote.hashCode());
        System.out.println("Original Value "+System.identityHashCode(remote));
        System.out.println();

        Rice rice = new Rice("Sona Masoori", 10, 600);
        System.out.println(rice);
        System.out.println(rice.hashCode());
        System.out.println("Original Value "+System.identityHashCode(rice));
        System.out.println();

        Ruler ruler = new Ruler(15, "Metal", 50);
        System.out.println(ruler);
        System.out.println(ruler.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ruler));
        System.out.println();

        Samosa samosa = new Samosa("Haldiram's", "Pyramid", 20);
        System.out.println(samosa);
        System.out.println(samosa.hashCode());
        System.out.println("Original Value "+System.identityHashCode(samosa));
        System.out.println();

        Scooter scooter = new Scooter("TVS", "Jupiter", 85000);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());
        System.out.println("Original Value "+System.identityHashCode(scooter));
        System.out.println();

        Shampoo shampoo = new Shampoo("Pantene", 200, "Smooth");
        System.out.println(shampoo);
        System.out.println(shampoo.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shampoo));
        System.out.println();

        Shirt shirt = new Shirt("Peter England", "blue", 1599);
        System.out.println(shirt);
        System.out.println(shirt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shirt));
        System.out.println();

        Shoe shoe = new Shoe("Nike", 10, 3499);
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println("Original Value "+System.identityHashCode(shoe));
        System.out.println();

        Soap soap = new Soap("Dove", "Beauty Bar", 45);
        System.out.println(soap);
        System.out.println(soap.hashCode());
        System.out.println("Original Value "+System.identityHashCode(soap));
        System.out.println();

        Socks socks = new Socks("Puma", "white", 199);
        System.out.println(socks);
        System.out.println(socks.hashCode());
        System.out.println("Original Value "+System.identityHashCode(socks));
        System.out.println();

        Sofa sofa = new Sofa("Fabric", 5, 15000);
        System.out.println(sofa);
        System.out.println(sofa.hashCode());
        System.out.println("Original Value "+System.identityHashCode(sofa));
        System.out.println();

        Speaker speaker = new Speaker("Bose", "Bluetooth", 5999);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println("Original Value "+System.identityHashCode(speaker));
        System.out.println();

        Stand stand = new Stand("Metal", "black", 999);
        System.out.println(stand);
        System.out.println(stand.hashCode());
        System.out.println("Original Value "+System.identityHashCode(stand));
        System.out.println();

        Star star = new Star("Polaris", 6000, 5);
        System.out.println(star);
        System.out.println(star.hashCode());
        System.out.println("Original Value "+System.identityHashCode(star));
        System.out.println();

        Stapler stapler = new Stapler("Butterfly", 50, 120);
        System.out.println(stapler);
        System.out.println(stapler.hashCode());
        System.out.println("Original Value "+System.identityHashCode(stapler));
        System.out.println();

        SunGlasses sunGlasses = new SunGlasses("Ray-Ban", "Aviator", 5999);
        System.out.println(sunGlasses);
        System.out.println(sunGlasses.hashCode());
        System.out.println("Original Value "+System.identityHashCode(sunGlasses));
        System.out.println();

        Table table = new Table("Dining", "Wooden", 12000);
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("Original Value "+System.identityHashCode(table));
        System.out.println();

        Ticket ticket = new Ticket("Coldplay Concert", "15/12", 5000);
        System.out.println(ticket);
        System.out.println(ticket.hashCode());
        System.out.println("Original Value "+System.identityHashCode(ticket));
        System.out.println();

        ToothPaste toothPaste = new ToothPaste("Pepsodent", "Mint", 75);
        System.out.println(toothPaste);
        System.out.println(toothPaste.hashCode());
        System.out.println("Original Value "+System.identityHashCode(toothPaste));
        System.out.println();

        Torch torch = new Torch("Eveready", 500, 199);
        System.out.println(torch);
        System.out.println(torch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(torch));
        System.out.println();

        ToyCar toyCar = new ToyCar("Red", "Matchbox", 99);
        System.out.println(toyCar);
        System.out.println(toyCar.hashCode());
        System.out.println("Original Value "+System.identityHashCode(toyCar));
        System.out.println();

        Towel towel = new Towel("Microfiber", "Beige", 299);
        System.out.println(towel);
        System.out.println(towel.hashCode());
        System.out.println("Original Value "+System.identityHashCode(towel));
        System.out.println();

        Tripod tripod = new Tripod("Carbon Fiber", 180, 2500);
        System.out.println(tripod);
        System.out.println(tripod.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tripod));
        System.out.println();

        Tshirt tshirt = new Tshirt("Adidas", "black", 1999);
        System.out.println(tshirt);
        System.out.println(tshirt.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tshirt));
        System.out.println();

        TV tv = new TV("Sony", 32, 22000);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println("Original Value "+System.identityHashCode(tv));
        System.out.println();

        Umbrella umbrella = new Umbrella("Black", 55, 499);
        System.out.println(umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println("Original Value "+System.identityHashCode(umbrella));
        System.out.println();

        USB usb = new USB("Samsung", 128, "USB 3.1");
        System.out.println(usb);
        System.out.println(usb.hashCode());
        System.out.println("Original Value "+System.identityHashCode(usb));
        System.out.println();

        Wallet wallet = new Wallet("Wildcraft", "Nylon", 999);
        System.out.println(wallet);
        System.out.println(wallet.hashCode());
        System.out.println("Original Value "+System.identityHashCode(wallet));
        System.out.println();

        Watch watch = new Watch("Casio", "Digital", 1999);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original Value "+System.identityHashCode(watch));
        System.out.println();

        Wire wire = new Wire("Aluminum", 15, "Black");
        System.out.println(wire);
        System.out.println(wire.hashCode());
        System.out.println("Original Value "+System.identityHashCode(wire));
        System.out.println();

        WoodenBox woodenBox = new WoodenBox("Teak", "rectangular", 2);
        System.out.println(woodenBox);
        System.out.println(woodenBox.hashCode());
        System.out.println("Original Value "+System.identityHashCode(woodenBox));
        System.out.println();

        Zeebra zeebra = new Zeebra("Bannerghatta", "Rahul", 75);
        System.out.println(zeebra);
        System.out.println(zeebra.hashCode());
        System.out.println("Original Value "+System.identityHashCode(zeebra));
        System.out.println();






    }
}
