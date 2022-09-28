import org.example.Room;

public class Player {
    private Room currentRoom;

    public Room getCurrentRoom () {
        return currentRoom;
    }
    public void setCurrentroom(Room room) {
        this.currentRoom = room;
    }
}
