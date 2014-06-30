/**
 * Created by mat on 26/06/14.
 */
public class Item {

    public String name;

    public double price;

    public long id;

    public int strength;

    public Item(String name, double price, long id) {
        this.name = name;
        this.price = price;
        this.id = id;
        // same here as in Monster, generate random strength on creation ob object
        this.strength = Util.getStrength();
    }


    public String toString() {
        return this.name + "(Strength:" + this.strength + "; Id: " + this.id;
    }

}
