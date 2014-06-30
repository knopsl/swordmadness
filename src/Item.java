/**
 * Created by mat on 26/06/14.
 */
public class Item {

    public String name;

    public double price;

    public long id;

    public int strenght;

    public String toString(){
        return this.name+"(Strength:"+this.strenght+"; Id: "+this.id;
    }

}
