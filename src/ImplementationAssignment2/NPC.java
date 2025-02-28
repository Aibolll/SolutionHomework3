package ImplementationAssignment2;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new NPC(name, description, health);
    }

    @Override
    public String toString() {
        return "NPC: " + name + " - " + description + " (Health: " + health + ")";
    }
}

