package org.example;
import java.util.Scanner;
public class Adventure {
UserInterface ui=new UserInterface();

public boolean north() {
    return ui.player.north();
}
public boolean east(){
    return ui.player.east();
}
public boolean south(){
    return ui.player.south();
}
public boolean west(){
    return ui.player.west();
}
    }










