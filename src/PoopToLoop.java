import java.util.Scanner;
import java.util.Arrays;

/**
 * Improvement: use 2D array to find when char is Uppercase so when printing out, you can change that.
 *
 * Bugs: none known
 *
 * @author Ajmain Naqib
 */

public class PoopToLoop {
    
  public static boolean ajDebug = false;    // Turn true to see debug messages.

    public static Character[] toCharacterArray(String s) {
    
        
        char C;
        if (s == null) {
            return null;
        }
        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len; i++) {
            C = s.charAt(i);
            C = Character.toLowerCase(C);
            array[i] = C;
        }
        return array;
    }

    public static String arrayToString(Character[] c) {

        String finalSentance = "";
        if (c == null) {
            return null;
        }

        int len = c.length;


        for (int i = 0; i < len; i++) {
            finalSentance += c[i];
        }

        return finalSentance;
    }


    public static void main(String[] args) {

        String lyric = "Poopy-di scoop Scoop-diddy-whoop Whoop-di-scoop-di-poop Poop-di-scoopty "
            + "Scoopty-whoop Whoopity-scoop, whoop-poop Poop-diddy, whoop-scoop Poop, "
            + "poop Scoop-diddy-whoop Whoop-diddy-scoop Whoop-diddy-scoop, poop ";

        // String lyric = "poop";

        Character[] badWord = {'p', 'o', 'o', 'p'};
        Character[] goodWord = {'l', 'o', 'o', 'p'};


        Character[] chars = toCharacterArray(lyric);
        int length = chars.length;
        String finalSentance;
        int found = 0;

        System.out.println("Original lyrics:"+ lyric);
        
        for (int i = 0; i < length; i++) {
            try {
                if (ajDebug) {
                    System.out.println("Char[" + i + "]: " + chars[i]);
                    System.out.println("Char[" + (i+1) + "]: " + chars[i+1]);
                    System.out.println("Char[" + (i+2)+ "]: " + chars[i+2]);
                    System.out.println("Char[" + (i+3) + "]: " + chars[i+3]);
                    }
                while ((chars[i] == badWord[0]) && (chars[i + 1] == badWord[1])
                    && (chars[i + 2] == badWord[2]) && (chars[i + 3] == badWord[3])) {
                    if (ajDebug) {
                        System.out.println("FOUND!");
                        
                        }
                    chars[i] = goodWord[0];
                    found++;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                if (ajDebug) {
                System.out.println("Sequential Forward Search Complete");
            }
            }
        }

            System.out.println("\nMade changes: "+found);
            
        
        finalSentance = arrayToString(chars);
        System.out.println("\nChanged lyrics:"+ finalSentance);
        System.exit(0);
    }
    
}


