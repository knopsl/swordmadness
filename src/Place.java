import java.util.ArrayList;
import java.util.List;

/**
 * Created by knopsl on 30.06.2014.
 */
public class Place {

    public String name;

    public String  description;

    public String coordinates;

    public List<Item> items = new ArrayList<Item>();

    public String toString(){
        return this.name+"; Description: "+this.description+"Coordinates: "+this.coordinates;
    }
}
