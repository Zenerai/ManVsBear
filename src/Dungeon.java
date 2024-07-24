
/**
 * Write a description of class Dungeon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dungeon {
    private final String name;
    private final String description;
    private final int temperature;
    private final Bear bear;

    public Dungeon(String name, String description, int temperature, Bear bear) {
        this.name = name;
        this.description = description;
        this.temperature = temperature;
        this.bear = bear;
    }

}
