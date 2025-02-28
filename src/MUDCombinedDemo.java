import BuilderAssignment1.Dungeon;
import BuilderAssignment1.Room;
import BuilderAssignment1.SimpleDungeonBuilder;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark and cold cave entrance."))
                .build();

        System.out.println("Original Dungeon: " + dungeon);

        Room originalRoom = new Room("Treasure Room", "A room filled with gold.");
        Room clonedRoom1 = originalRoom.cloneEntity();
        clonedRoom1.setName("Treasure Room - Clone #1");

        Room clonedRoom2 = originalRoom.cloneEntity();
        clonedRoom2.setName("Treasure Room - Clone #2");

        dungeon.addRoom(clonedRoom1);
        dungeon.addRoom(clonedRoom2);

        System.out.println("Updated Dungeon: " + dungeon);
    }
}
