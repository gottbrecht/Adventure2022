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





        }
