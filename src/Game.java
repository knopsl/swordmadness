import java.util.Scanner;

/**
 * Created by mat on 26/06/14.
 */
public class Game {

    public static void main(String[] arg) throws Exception {

        /*PLACES----------------------------------------------BEGIN*/

        Place room = new Place();
        room.name = "first room";
        room.description = "test description...";
        room.coordinates = "A1";

        Item pill = new Item();
        pill.name = "Suicide Pill";
        room.items.add(pill);
        room.items.size();
        System.out.println(pill.toString());

        /*TODO:
          compare place coordinates with map coordinates to check where you are and options/items in that room.
          change map coordinates via setter automatically within gameflow or by players choice.
        */


        /*PLACES------------------------------------------------END*/


        System.out.println("SWORDMADNESS - Even the Title is Madness D:");
        System.out.println("The moment you spawn at that Pit, you know there will be no happy ending after all..." +
                "Pick up a sword (or many) and fight your way...as far as you get. ");
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        String in = inp.nextLine();
        Player p = new Player();
        p.name = in;

        System.out.println(p.toString());
        System.out.println("Make your move. (fight)(map)(list)(pickup)");



        while (!"quit".equals(in)) {
            in = inp.nextLine();

            if ("fight".equals(in)) {
                System.out.println(in);
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
                       System.out.println("YOU WIN! ^(o.O)^");
                       p.items.remove(0);
                   }

                   else {
                       System.out.println("YOU LOSE!  <(x.x)>");
                       Thread.sleep(10000);
                       System.exit(0);
                   }

                }
            else {
                    System.out.println("You don't have anything to fight with! Run bitch!!!");
                }

            }
            if ("pickup".equals(in)) {
                System.out.println("you are going to pick up a sword.");
                Thread.sleep(1000);
                Item i = new Item();
                i.id = System.currentTimeMillis();
                i.name = "Sword";
                i.strenght = Util.getStrength();
                System.out.println("atm you are picking it up...");
                p.items.add(i);
                p.items.size();
                Thread.sleep(1000);
                System.out.println("Done!  this is your sword:");
                System.out.println(i.toString());
            }
            if ("map".equals(in)) {
                Map i = new Map("map1","This is a boring old map, outdated as f***, why would anyone pick up one of these anyway...","A1");
                i.id = System.currentTimeMillis();

                p.items.add(i);
                p.items.size();
                System.out.println(i.toString());
            }
            /* TODO:
            if (in == 'n') {
                CharSequence t = "map1";
                if (p.items.contains(t)) {
                System.out.println("IT WORKED");

                }
                else {

                    System.out.println("IT DIDN'T WORK :(");
                }
            } */
            if ("list".equals(in)) {
                System.out.println("Ooh look at what you've got:");
                for (Item i : p.items) {
                    System.out.println(i.toString());
                }
            }


            /*in = (char) System.in.read();*/

        }


    }


}
