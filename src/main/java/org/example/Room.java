package org.example;

public class Room {
    private String name;
    private String description;
    private String direction;
    private String go;

    private Room north;
    private Room west;
    private Room south;
    private Room east;


    //Konstruktør
    public Room(String name, String description, String direction, String go) {
        this.name = name;
        this.description = description;
        this.direction = direction;
        this.go = go;
    }

    //Getter
    public String getDirection() {
        return direction;
    }

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


}
