import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by mat on 26/06/14.
 */
public class Util {

    public static List<String> syllablesMonster = Arrays.asList("Ran","Tan","Plan","Wur","St");
    public static List<String> syllablesNpc = Arrays.asList("Ran","Tan","Plan","Wur","St");

    public static int getStrength() {
        Random r = new Random();
        int i = r.nextInt();
        if (i < 0) {
            i = i * -1;
        }
        i = i % 100;

        return i;
    }

    public static String getMagicNameMonster() {
        String firstSyllable =getMagicSyllable(syllablesMonster);
        String secondSyllable =getMagicSyllable(syllablesMonster);

        return firstSyllable + secondSyllable;

    }

    public static String getMagicNameNpc() {
        String firstSyllable =getMagicSyllable(syllablesNpc);
        String secondSyllable =getMagicSyllable(syllablesNpc);

        return firstSyllable + secondSyllable;

    }

    private static String getMagicSyllable(List<String> syllables) {
        Random magic = new Random();
        int magicNumber = magic.nextInt(syllables.size());
        return syllables.get(magicNumber);
    }

}
