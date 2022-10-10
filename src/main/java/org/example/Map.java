package org.example;

public class Map {
   private Room startRoom;
    private Room currentRoom;

    public Map(){

    //private Room currentRoom = new Room("Room 1", "First room");
        Room room1 = new Room("Room 1", "Garage: Where your trashy car is parking");
        Room room2 = new Room("Room 2", "Painting room: Upgrade the surface of your car");
        Room room3 = new Room("Room 3", "Tires Factory: Upgrade your tires");
        Room room4 = new Room("Room 4", "Welcome to the electronic House: Get your rainbow diode lights");
        Room room5 = new Room("Room 5", "House Of Diamonds: End station for diamond logo and gear");
        Room room6 = new Room("Room 6", "Sound House: Upgrade your speaker: b&o sound system");
        Room room7 = new Room("Room 7", "Motor Room: More Horsepower for your baby");
        Room room8 = new Room("Room 8", "Gadget Room: Get your Soda-and Popcorn Machine, " +
                "massage chair, mocha machine");
        Room room9 = new Room("Room 9", "Interior Hall: Leather seats, fur carpet, movie screen");

        Item cash = new Item("cash", "Go work in the garage and earn money");
        Item goldenWheels = new Item("golden wheels", "pure 18 karat gold");
        Item carPaint = new Item("car paint", "new advanced car paint");
        Item diamond = new Item("diamond steering wheel", "diamond logo");

        Item soundSystem =new Item ("surround sound system","B&O surround steroes");
        Item rainbowLights =new Item ("rainbow lights", "colourful lights under the car");
        Item motor =new Item ("v12 motor", "upgrade the motor to v12 with great hourse power");
        Item carpet =new Item ("fur carpet", "fancy carpet for the car");
        Item leatherSeats =new Item("leather seats","top soft leather seats");
        Item screen=new Item("movie screen", "watch moive in the car");

        Item coffeMachine = new Item("coffee machine", "Express coffee in one 1 minut");
        Item popcornMachine = new Item ("popcorn machine", "fresh made popcorn");
        Item sodaMachine=new Item("soda machine", "fresh made soda");

        Food food1 = new Food("Ribeye", "Steak", 70);
        Food food2 = new Food("Butter Chicken", "Indian cuisine", 85);
        Food food3 = new Food("Yankie bar", "Energy bar", 25);

        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(cash);

        room2.setEast(room3);
        room2.setWest(room1);
        room2.addItem(carPaint);

        room3.setWest(room2);
        room3.setSouth(room6);
        room3.addItem(goldenWheels);

        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItem(rainbowLights);

        room5.setSouth(room8);
        room5.addItem(diamond);

        room6.setSouth(room9);
        room6.setNorth(room3);
        room6.addItem(soundSystem);

        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addItem(motor);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);
        room8.addItem(coffeMachine);
        room8.addItem(sodaMachine);
        room8.addItem(popcornMachine);

        room9.setNorth(room6);
        room9.setWest(room8);
        room9.addItem(leatherSeats);
        room9.addItem(carpet);
        room9.addItem(screen);



        startRoom =room1;
    }
    public Room getStartRoom() {
       return startRoom;
   }




   }

