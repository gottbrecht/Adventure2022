package org.example;
import java.util.ArrayList;
import org.example.Room;

public class Player {
    private Room currentRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentroom(Room room) {
        this.currentRoom = room;

    }

    public boolean north() {
        return false;
    }
    public boolean east() {
        return false;
    }
    public boolean south() {
        return true;
    }
    public boolean west() {
        return true;
    }

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
    public void addItem(Item item) {
        itemList.add(item);
    }
    private final ArrayList<String> itemList = new ArrayList<>();
}
