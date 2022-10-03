package org.example;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    private Room north;
    private Room west;
    private Room south;
    private Room east;

    private ArrayList<String> items = new ArrayList<>(); {
        items.add("cash");
        items.add("golden wheels");
        items.add("car paint");
        items.add("diamond steering wheel");
        items.add("coffe machine");
        items.add("popcorn machine");
        items.add("surround sound-system");
        items.add("rainbow lights");
        items.add("v12 motor");
        items.add("fur carpet");
        items.add("leather seats");
        items.add("soda machine");
        items.add("movie screen");
    }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return "Room {" +
                "name= " + name + '\'' + ", description='" + description + '\'' + '}';

    }
}
