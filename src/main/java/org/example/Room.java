package org.example;

public class Room {
  private String name;
  private String description;

  private Room north;
  private Room west;
  private Room south;
  private Room east;

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
    public Room getNorth(){
        return north;
    }
    public Room getWest(){
        return west;
    }
    public Room getSouth(){
        return south;
    }
    public Room getEast() {
        return east;
    }

    //Setter
    public void setNorth(Room north){
    this.north = north;
    }
    public void setWest(Room west){
        this.west = west;
    }
    public void setSouth(Room south){
        this.south = south;
    }
    public void setEast(Room east){
        this.east = east;
    }


        }
