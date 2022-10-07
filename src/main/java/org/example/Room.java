package org.example;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    private Room north;
    private Room west;
    private Room south;
    private Room east;

    private ArrayList<Item> items = new ArrayList<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    //Getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    //Getter
    public Room getNorth() {
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

    public ArrayList<Item> getItems() {
        return items;
    }
    /*public Item removeItem(String name){
        for (Item item : roomItems){
            if (item.getName().equals(name)){
                roomItems.remove(item);
                return item;
            }
        }
        return null;*/

    @Override
    public String toString() {
        return "Room {" +
                "name= " + name + '\'' + ", description='" + description + '\'' + '}';

    }
}
