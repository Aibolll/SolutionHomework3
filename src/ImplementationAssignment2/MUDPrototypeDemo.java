public class MUDPrototypeDemo {
    public static void main(String[] args) {
        
        Room throneRoom = new Room("Throne Room", "A majestic hall with a golden throne.");
        NPC skeletonWarrior = new NPC("Skeleton Warrior", "An undead soldier guarding the dungeon.", 100);

        Room copiedRoom = throneRoom.clone();
        NPC copiedNPC = skeletonWarrior.clone();
        
        System.out.println("Original and Cloned Entities:");
        System.out.println("Room: " + throneRoom);
        System.out.println("Cloned Room: " + copiedRoom);
        System.out.println("NPC: " + skeletonWarrior);
        System.out.println("Cloned NPC: " + copiedNPC);
        
        copiedRoom.setDescription("A dusty old chamber with mysterious carvings.");
        copiedNPC.setHealth(80);
        
        System.out.println("\nAfter modifications:");
        System.out.println("Updated Cloned Room: " + copiedRoom);
        System.out.println("Updated Cloned NPC: " + copiedNPC);
    }
}
