/**
 * Created by knopsl on 29.06.2014.
 */
public class Map extends Item {

    // Map inhertis id, name already from Item, so no need to define them here
    public String coordiantes, description;
    // Also: Because Map inherits from Item, it has the attribute strength.
    // Maybe you should create a new class Sword which inherits from Item?

    public Map(String name, String description, String coordinates) {
        // we first call the constructor of Item here with super
        super(name, 0.0, 0);
        // and later initialize the map attributes
        this.coordiantes = coordinates;
        this.description = description; // might consider to move this to item
    }


    public String toString() {
        return this.name + "(Description:" + this.description + this.coordiantes + ")";
    }

    // noo need to check in commented-out source code, you can always revert to another version with git
}