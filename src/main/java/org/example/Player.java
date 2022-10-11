package org.example;

import java.util.ArrayList;


public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentroom(Room room) {
        this.currentRoom = room;

    }

    public boolean north() {
        return north();
    }

    public boolean east() {
        return east();
    }

    public boolean south() {
        return south();
    }

    public boolean west() {
        return west();
    }

    public boolean move(String direction) {
        Room requestedRoom = null;
        if (direction.charAt(0) == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = currentRoom.getSouth();
        } else if (direction.charAt(0) == 'w') {
            requestedRoom = currentRoom.getWest();
        }
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Item> Inventory() {
        return inventory;
    }
    public void addItem(Item item){
        inventory.add(item);
    }

    public Item findItemInInventory(String itemName) {

        for(int i = 0; i < playerInput; i++) {
            findItemInInventory().add(i);
        }

        // 1) find item med itemName i currentROOM

        // 2) remove it from the room;
        // 3) add the item to itemTaken.
//loop igennem item og find item


    public boolean dropItem(String itemName) {
        Item item = findItemInInventory(itemName);
        if(item != null) {
            inventory.remove(item);
            getCurrentRoom().addItem(item);
            return true;
        }else {
            return false;
        }
    }

}
