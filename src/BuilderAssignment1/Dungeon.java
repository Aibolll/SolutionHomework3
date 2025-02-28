package BuilderAssignment1;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;

    public Dungeon(String name, List<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        return "Dungeon{name='" + name + "', rooms=" + rooms + "}";
    }
    public String describe() {
        return "Dungeon: " + this.name; // Добавь логику по описанию
    }

}
