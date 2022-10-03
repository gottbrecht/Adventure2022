package org.example;

public class Map {
   private Room startRoom;
    private Room currentRoom= new Room("","");


    public Map(){

    //private Room currentRoom = new Room("Room 1", "First room");
        Room room1 = new Room("Room 1", "Garage: Where your trashy car is parking");
        Room room2 = new Room("Room 2", "Painting room: Upgrade the surface of your car");
        Room room3 = new Room("Room 3", "Tires Factory: Upgrade your tires");
        Room room4 = new Room("Room 4", "Electronic House: Rainbow diode lights");
        Room room5 = new Room("Room 5", "House Of Diamonds: End station for diamond logo and gear");
        Room room6 = new Room("Room 6", "Sound House: Upgrade your speaker: b&o sound system");
        Room room7 = new Room("Room 7", "Motor Room: More Horsepower for your baby");
        Room room8 = new Room("Room 8", "Gadget Room: Get your Soda-and Popcorn Machine, " +
                "massage chair, mocha machine");
        Room room9 = new Room("Room 9", "Interior Hall: Leather seats, fur carpet, movie screen");


        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setSouth(room9);
        room6.setNorth(room3);

        room7.setNorth(room4);
        room7.setEast(room8);

        room9.setNorth(room6);
        room9.setWest(room8);

        startRoom =room1;
    }
    public Room getStartRoom() {
       return startRoom;
   }




   }

