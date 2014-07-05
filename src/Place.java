import java.util.ArrayList;
import java.util.List;

/**
 * Created by knopsl on 30.06.2014.
 */
public class Place {

    public String name;

    public String description;

    public List<Item> items;

    public Place() {

        name = Util.getMagicNamePlace();
        description = "";
        items = new ArrayList<Item>();

    }


    public String toString() {
        return this.name + "\n Description: " + this.description + "Coordinates: ";
    }
}
