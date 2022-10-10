package org.example;

import java.util.Scanner;

public class UserInterface {
    Map map = new Map();

    Room room = new Room("", ".");
    Player player = new Player();

    public void run() {

        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure(player);
        player.setCurrentroom(adventure.map.getStartRoom());

        System.out.println("Welcome to the Pimp My Ride game!\n");
        System.out.println(" Description:\n In order to upgrade your trashy car,\n you need to " +
                "explorer the 9 different areas, and enter the areas where you can gather gadgets or components.\n " +
                "When you enter the last area, which is your goal of the game,\n you enter House Of Diamonds.\n" +
                " Along the game, you get the fancy upgrades, like a new speaker, or the golden wheels." +
                "\n You can type 'go north', 'south', 'east' or 'west'.\n You may also choose to type 'look', to repeat" +
                " description of the area, or 'help'.\n " +
                "When you head toward the wrong direction: Watch out for the wolves! " +
                "You may have to go to another direction.\n " +
                "If you want to end the game, just press exit. Enjoy your game!");

        System.out.println(" Your car is parked in the garage");
        System.out.println(" Type the direction you want to go here:");
        System.out.println(player.getCurrentRoom());

        do {
            Scanner sc = new Scanner(System.in);
            String playerInput = scanner.nextLine();
            playerInput = playerInput.toLowerCase();
            switch (playerInput) {
                case "go north", "north", "n":
                    if (adventure.north(player)) {
                        System.out.println("Going north" + player.getCurrentRoom() + room.getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;
                case "go east", "east":
                    if (adventure.east(player)) {
                        System.out.println("Going east" + player.getCurrentRoom() +
                                room.getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;
                case "go south", "south":
                    if (adventure.south(player)) {
                        player.setCurrentroom(player.getCurrentRoom());
                        System.out.println("Going south " + player.getCurrentRoom());
                    } else
                        System.out.println("You can not go that way!");
                    break;
                case "go west", "west":
                    if (adventure.west(player)) {
                        System.out.println("Going west " + player.getCurrentRoom() +
                                room.getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;
                case "help":
                    System.out.println("What do you need help with?\n1. Money issues \n2. Tell me that I am handsome");
                    int choice = scanner.nextInt();
                    scanner.nextLine();//Scanner bug
                    if (choice == 1) {
                        System.out.println("Go back to garage and work hard in order to earn money.");
                    } else if (choice == 2) {
                        System.out.println("You are handsome.");
                    } else {
                        System.out.println("You have not entered the correct answer!");

                    }

                    break;
                case "look":
                    System.out.println("look");
                    System.out.println("You are in: " + room.getName());
                    System.out.println(player.getCurrentRoom());
                    System.out.println(room.getDescription());
                    break;
                case "exit":
                    System.out.println("Exit - ending game");
                    break;

                case "get", "Get" -> {
                    Item pickedUpItem = player.getItem();
                    if (pickedUpItem == null) {
                        System.out.println("There is nothing called that..");
                    } else {
                        System.out.println("you have picked up " + pickedUpItem);
                        player.getItem();
                    }
                }

                case "drop", "Drop","remove", "Remove" -> {
                    Item droppedItem = player.dropItem();
                    if (droppedItem == null) {
                        System.out.println("There is nothing called that..");
                    } else {
                        System.out.println("You have dropped " + droppedItem);
                    }
                }
            }
        } while (true);


    }
}
