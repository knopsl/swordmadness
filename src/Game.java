/**
 * Created by mat on 26/06/14.
 */
public class Game {

    public static void main(String[] arg) throws Exception {


        Player p = new Player();
        p.name = "Gizmo";

        System.out.println(p.toString());

        char in = (char) System.in.read();
        while (in != 'q') {
            if (in == 'f') {
                System.out.println("FIGHT!");

                Monster m = new Monster("Whatev","wtf? lorem ipsum sdads");
                if (p.items.size()>0 ){ //gibts das schwert schon?
                    Item item = p.items.get(0);
                   if (item.strenght > m.strength){
                       System.out.println("you win!");
                       p.items.remove(0);
                   }

                   else {
                       System.out.println("you lose!");
                       Thread.sleep(10000);
                       System.exit(0);
                   }

                }
            else {
                    System.out.println("Run bitch");
                }

            }
            if (in == 'p') {
                Item i = new Item();
                i.id = System.currentTimeMillis();
                i.name = "Schwert";
                i.strenght = Util.getStrength();
                p.items.add(i);
                p.items.size();
                System.out.println(i.toString());
            }
            if (in == 'm') {
                Map i = new Map("map1","blablalbalbalba","A1");
                i.id = System.currentTimeMillis();

                p.items.add(i);
                p.items.size();
                System.out.println(i.toString());
            }
            /*  if (in == 'n') {
                CharSequence t = "map1";
                if (p.items.contains(t)) {
                System.out.println("IT WORKED");

                }
                else {

                    System.out.println("IT DIDN'T WORK :(");
                }
            } */
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
