import java.util.ArrayList;
import java.util.List;

/**
 * Created by knopsl on 30.06.2014.
 */
public class Place {

    public String name;

    public String description;

    public List<Item> items;

    private Coordinates coordinates;

    private Player player;

    public Place(int coordinateX, int coordinateY) {
        this.name = Util.getMagicNamePlace();
        this.description = "";
        this.items = new ArrayList<Item>();
        this.coordinates = new Coordinates(coordinateX, coordinateY);
    }

    public String getName(){
        return this.name;
    }

    public String getCoordinates(){
        return this.coordinates.toString();
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public String getContent(){
        if(this.player != null){
            return player.name;
        } else{
            return this.name;
        }
    }

    public String toString() {
        return this.name + "\n Description: " + this.description + "Coordinates: ";
    }
}
