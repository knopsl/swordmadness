import java.util.Random;

/**
 * Created by mat on 26/06/14.
 */
public class Game {

    public static void main(String[] arg) throws Exception {


        Player p = new Player();
        p.name = "Gizmo";
        Random r = new Random();

        System.out.println(p.toString());

        char in = (char) System.in.read();
        while (in != 'q') {
            if (in == 'p') {
                Item i = new Item();
                i.id = System.currentTimeMillis();
                i.name = "Schwert";
                i.strenght = Util.getstrength();

                Item t = new Item();

                p.items.add(i);
                p.items.size();
                System.out.println(i.toString());
            }
            if (in == 'l') {
                System.out.println("Spieler hat folgende Items:");
                for (Item i : p.items) {
                    System.out.println(i.toString());
                }
            }


            in = (char) System.in.read();
        }


    }


}
