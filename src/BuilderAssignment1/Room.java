package BuilderAssignment1;

public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Метод для клонирования комнаты
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    // Метод для установки нового имени
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room{name='" + name + "', description='" + description + "'}";
    }
}
