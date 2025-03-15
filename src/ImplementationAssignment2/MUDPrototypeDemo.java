package ImplementationAssignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        
        Room originalRoom = new Room("Throne Room", "A majestic hall with a golden throne.");
        NPC originalNPC = new NPC("Skeleton Warrior", "An undead soldier guarding the dungeon.", 100);

        Room clonedRoom = (Room) originalRoom.cloneEntity();
        NPC clonedNPC = (NPC) originalNPC.cloneEntity();

        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println();
        System.out.println("Original NPC: " + originalNPC);
        System.out.println("Cloned NPC: " + clonedNPC);

        clonedRoom = new Room(clonedRoom.getName() + " (Clone)", clonedRoom.getDescription());
        clonedNPC = new NPC(clonedNPC.getName() + " (Clone)", clonedNPC.getDescription(), clonedNPC.getHealth() - 20);

        System.out.println("\nAfter modifying clones:");
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println("Cloned NPC: " + clonedNPC);
        
    }
}
