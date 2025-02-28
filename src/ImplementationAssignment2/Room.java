package ImplementationAssignment2;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new Room(name, description);
    }

    @Override
    public String toString() {
        return "Room: " + name + " - " + description;
    }
}

