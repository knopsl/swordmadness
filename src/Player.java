import java.util.ArrayList;
import java.util.List;

/**
 * Created by mat on 26/06/14.
 */
public class Player {

    public String name;

    public List<Item> items = new ArrayList<Item>();

    public String toString(){
        return "player name: " + this.name;
    }

}
