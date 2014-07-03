/**
 * Created by ux31e on 03.07.2014.
 */
public class World {
    public Place[][] checkboard;
    public String name;
    public int x,y;


    public World (String name) {

        this.name = name;
        checkboard = new Place[10][10];
        this.x=0;
        this.y=0;
    }

    public Place whereAmI(){

        return checkboard[x][y];
    }


}
