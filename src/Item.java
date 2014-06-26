/**
 * Created by mat on 26/06/14.
 */
public class Item {

    public String name;

    public double priceInDollars;

    public long id;

    public int strenght;

    public String toString(){
        return this.name+"(Stärke:"+this.strenght+"; Id: "+this.id;
    }

}
