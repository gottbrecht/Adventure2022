package org.example;
import java.util.Scanner;
public class Adventure {


    Room room = new Room("", "");
    Map map = new Map();
    Player player = new Player();
    UserInterface ui = new UserInterface();

    public boolean north() {
        if (player.getCurrentRoom().getNorth() == player.getCurrentRoom()) {
            return true;

        } else {

            return false;
        }
    }

    public boolean east() {
        if (player.getCurrentRoom().getEast() == player.getCurrentRoom()) {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean south() {
        if (player.getCurrentRoom().getSouth() == player.getCurrentRoom()) {
            return true;

        } else
        {

            return false;
        }
    }

    public boolean west() {
        if (player.getCurrentRoom().getWest() == player.getCurrentRoom()) {
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















