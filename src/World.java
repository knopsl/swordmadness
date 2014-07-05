/**
 * Created by ux31e on 03.07.2014.
 */
public class World {
    public Place[][] checkboard;
    public String name;
    public int x,y, sizeX, sizeY;


    public World (String name, int sizeX, int sizeY) {

        this.name = name;
        this.x=0;
        this.y=0;
        this.sizeX=sizeX;
        this.sizeY=sizeY;
        checkboard = generateWorld();
    }

    private Place[][] generateWorld() {
        Place[][] places = new Place[10][10];
        for(int coordinateX=0; coordinateX<sizeX; coordinateX++){
            for(int coordinateY=0; coordinateY<sizeY; coordinateY++){
                places[coordinateX][coordinateY] = new Place();
            }
        }
        return places;
    }

    public Place whereAmI(){

        return checkboard[x][y];
    }




}
