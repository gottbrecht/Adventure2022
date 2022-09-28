package org.example;

import java.util.Scanner;
public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();

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
        System.out.println(" Type direction here:");

        do {
            String playerInput = scanner.nextLine();
            playerInput = playerInput.toLowerCase();
            switch (playerInput) {
                case "go north", "north":
                    System.out.println("Going north");
                    break;
                case "go east", "east":
                    System.out.println("Going east");
                    break;
                case "go south", "south":
                    System.out.println("Going south");
                    break;
                case "go west", "west":
                    System.out.println("Going west");
                    break;
                case "help":
                    System.out.println("What do you need help with?\n1. Money issues \n2. Find the way");
                    int choice = 1;
                    if (choice == 1) {

                    }else {}System.out.println("Go back to garage and work hard in order to earn money.");

                    break;
                case "look":
                    System.out.println("look");
                    System.out.println("You are in: " + adventure.getCurrentRoom().getName());
                    System.out.println(adventure.getCurrentRoom().getDescription());
                    break;
                case "exit":
                    System.out.println("Exit - ending game");
                    break;
            }
        } while (true);
    }

}