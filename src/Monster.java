/**
 * Created by mat on 26/06/14.
 */
public class Monster {
    public String name;
    public String description;
    public int strength;

    public Monster(String name,
                   String description) {
        this.name = name;
        this.description = description;
        this.strength = Util.getstrength();
    }


}

