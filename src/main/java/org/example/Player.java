package org.example;
import java.util.ArrayList;
import org.example.Room;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentroom(Room room) {
        this.currentRoom = room;

    }
public boolean north(){
        return north();
}
public boolean east(){
        return east();
}
public boolean south(){
        return south();
}
public boolean west(){
        return west();
}
private ArrayList <Item> inventory;
    
    public boolean move(String direction) {
        Room requestedRoom = null;
        if (direction.charAt(0) == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = currentRoom.getSouth();
        } else if (direction.charAt(0) == 'w')  {
            requestedRoom = currentRoom.getWest();
        }
if(requestedRoom !=null){
    currentRoom =requestedRoom;
    return true;
}
else {
    return false;
}
    }

}
