package BuilderAssignment1;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public SimpleDungeonBuilder() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        if (npc != null) {
            npcs.add(npc);
        }
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, new ArrayList<>(rooms));
    }
}

