package org.example;

public class Adventure {

    Map map = new Map();
    private Object itemName;

    public Player getPlayer() {

        Player player = new Player();
        return player;
    }

    public Adventure(Player player) {
        player.setCurrentroom(map.getStartRoom());
    }

    public boolean north(Player player) {
        if (player.getCurrentRoom().getNorth() != null) {
            player.setCurrentroom(player.getCurrentRoom().getNorth());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else {

            return false;
        }
    }

    public boolean east(Player player) {
        if  (player.getCurrentRoom().getEast() != null)
        /*(player.getCurrentRoom().setEast(Room east) !=null */
        {
            player.setCurrentroom(player.getCurrentRoom().getEast());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;
        } else
        {
            return false;
        }
    }

    public boolean south(Player player) {
        if (player.getCurrentRoom().getSouth() != null) {
            player.setCurrentroom(player.getCurrentRoom().getSouth());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else
        {

            return false;
        }
    }

    public boolean west(Player player) {
        if  (player.getCurrentRoom().getWest() != null) {
            player.setCurrentroom(player.getCurrentRoom().getWest());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else
        {

            return false;
        }

        public boolean getItem(String itemName) {
            return player.getItem(itemName)
        }

        public boolean dropItem(String itemName) {
            return player.dropItem(itemName);
        }
        /* Calling move method from Player class
        public boolean go(String direction){
            return player.move(direction);*/
        }
    }















