import java.util.Random;

/**
 * Created by mat on 26/06/14.
 */
public class Test {

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
                i.strenght = getstrength();
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

    public static int getstrength() {
        Random r = new Random();
        int i = r.nextInt();
        if (i < 0) {
            i = i * -1;
        }
        i = i % 100;

        return i;
    }

}
