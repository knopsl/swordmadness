import java.util.Random;

/**
 * Created by mat on 26/06/14.
 */
public class Test {

    public static void main(String[] arg) throws Exception{


        Player p = new Player();
        Random r = new Random();

        char in= (char) System.in.read();
        while( in != 'q' ){
            if(in == 'p'){
                Item i = new Item();
                i.id = System.currentTimeMillis();
                i.name = "Schwert";
                i.strenght = r.nextInt() % 100;
                p.items.add(i);
                System.out.println(i.toString());
            }
            if(in == 'l'){
                System.out.println("Spieler hat folgende Items:");
                for(Item i:p.items){
                    System.out.println(i.toString());
                }
            }


            in= (char) System.in.read();
        }




    }

}
