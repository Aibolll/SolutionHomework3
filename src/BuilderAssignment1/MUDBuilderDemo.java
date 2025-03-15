package BuilderAssignment1;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cavern")
                .addRoom(new Room("Entrance", "A dark and cold cave entrance."))
                .addRoom(new Room("Treasure Chamber", "A room filled with gold and treasures."))
                .addNPC(new NPC("Goblin"))
                .addNPC(new NPC("Dragon"))
                .build();

        dungeon.describe();
        
    }
}
