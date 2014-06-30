/**
 * Created by knopsl on 29.06.2014.
 */
public class Map extends Item {
    public static String name;
    public String description;
    public String coordiantes;
    public long id;

    public Map(String name,
               String description, String coordinates) {
        this.name = name;
        this.description = description;
        this.coordiantes = coordinates;
    }


    public String toString() {
        return this.name + "(Description:" + this.description + this.coordiantes+")";
    }

    /* TODO:
    public void setCoordinates(String i) {

        this.coordiantes = i;

    }

    public String getCoordinates() {

        return this.coordiantes;
    }



    public void setName(String name) {
        this.name = name;
    }
    */
}