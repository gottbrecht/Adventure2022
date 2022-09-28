package org.example;
import java.util.Scanner;
public class Adventure {

Room room = new Room("test", "test");

public void start() {
    do {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println(room.getCurrentRoom());
                System.out.println(room.getDescription());
                break;
            case "exit":
                System.out.println("Exit - ending game");
                break;
        }
    } while (true);

}
    }









