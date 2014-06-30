import java.util.Random;

/**
 * Created by mat on 26/06/14.
 */
public class Util {


    public static int getStrength() {
        Random r = new Random();
        int i = r.nextInt();
        if (i < 0) {
            i = i * -1;
        }
        i = i % 100;

        return i;
    }

}
