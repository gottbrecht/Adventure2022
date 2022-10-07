package org.example;

public class Adventure {


    Map map = new Map();
    Player player = new Player();

    public Adventure(){
        player.setCurrentroom(map.getStartRoom());
    }
    public boolean north() {
        if  (player.getCurrentRoom().getNorth() != null) {
            player.setCurrentroom(player.getCurrentRoom().getNorth());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else {

            return false;
        }
    }

    public boolean east() {
        if  (player.getCurrentRoom().getEast() != null) {
            player.setCurrentroom(player.getCurrentRoom().getEast());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;
        } else
        {
            return false;
        }
    }

    public boolean south() {
        if (player.getCurrentRoom().getSouth() != null) {
            player.setCurrentroom(player.getCurrentRoom().getSouth());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else
        {

            return false;
        }
    }

    public boolean west() {
        if  (player.getCurrentRoom().getWest() != null) {
            player.setCurrentroom(player.getCurrentRoom().getWest());
            System.out.println(player.getCurrentRoom().getDescription());
            return true;

        } else
        {

            return false;
        }
        /* Calling move method from Player class
        public boolean go(String direction){
            return player.move(direction);*/
        }
    }















