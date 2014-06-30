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
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("FIGHT!");
                Thread.sleep(2000);

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
                System.out.println("you are going to pick up a sword.");
                Thread.sleep(1000);
                Item i = new Item();
                i.id = System.currentTimeMillis();
                i.name = "Schwert";
                i.strenght = Util.getStrength();
                System.out.println("atm you are picking it up...");
                p.items.add(i);
                p.items.size();
                Thread.sleep(1000);
                System.out.println("Done!  this is your sword:");
                System.out.println(i.toString());
            }
            if (in == 'm') {
                Map i = new Map("map1","This is a boring old map, outdated as f***, why would anyone pick up one of these anyway...","A1");
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
                System.out.println("Ooh look at what you've got:");
                for (Item i : p.items) {
                    System.out.println(i.toString());
                }
            }


            in = (char) System.in.read();

        }


    }


}
