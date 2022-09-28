package org.example;

import org.example.Room;

public class Player {
    private Room currentRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentroom(Room room) {
        this.currentRoom = room;

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

}
