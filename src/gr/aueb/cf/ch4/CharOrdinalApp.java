package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει χαρακτήρες και το ordinal number (code-point).
 */

public class CharOrdinalApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '#';

        System.out.printf("char: %c, ordinal: %c\n", ch1, (int) ch1);
        System.out.printf("char: %c, ordinal: %c", ch2, (int) ch2);
    }
}
