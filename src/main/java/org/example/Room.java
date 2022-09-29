package org.example;

public class Room {
  private String name;
  private String description;
  private String currentRoom;
  private String item;
  private final String itemList;


  private Room north;
  private Room west;
  private Room south;
  private Room east;



    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.currentRoom=currentRoom;


    }
    //Getter
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getItem() {
        return item;
    }
    public String getItemList() {
        return itemList;
    }

public void setName () {
        this.name=name;
}
public void setDescription(){
        this.description=description;
}
    //Getter
    public Room getNorth(){
        return north;
    }
    //Setter
    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public static class room {
        private Room currentRoom;

        public Room getCurrentRoom () {
            return currentRoom;
        }
        public void setCurrentroom(Room room) {
            this.currentRoom = room;
        }
    }
    @Override
    public String toString() {
        return "Room {"+
                "name= " +name+ '\''+ ", description='"+ description + '\''+'}';

    }
}
