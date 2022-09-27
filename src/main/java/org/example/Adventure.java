package org.example;
public class Adventure {

    private Room currentRoom = null;

    public Room getCurrentRoom () {
        return currentRoom;
    }

//private Room currentRoom = new Room("Room 1", "First room");
    public void createRooms() {
        Room room1 = new Room("Room 2", "Second room");
        Room room2 = new Room("Room 3", "Third room");
        Room room3 = new Room("Room 4", "Fourth room");
        Room room4 = new Room("Room 5", "Fifth room");
        Room room5 = new Room("Room 6", "Sixth room");
        Room room6 = new Room("Room 7", "Seventh room");
        Room room7 = new Room("Room 8", "Eight room");
        Room room8 = new Room("Room9", "Ninth room");
        Room room9 = new Room("Room9", "Ninth room");


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
        room6.setNorth((room3);

        room7.setNorth(room4);
        room7.setEast(room8);

        room9.setNorth(room6);
        room9.setWest(room8);
    }


}






