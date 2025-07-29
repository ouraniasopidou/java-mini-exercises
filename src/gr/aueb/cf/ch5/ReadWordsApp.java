package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * διαβάζει διαδοχικά λέξεις και κενά
 * μέχρι να βρει τον χαρακτήρα #
 */
public class ReadWordsApp {

    static boolean isHash = false;
    static char ch = ' ';

    public static void main(String[] args) throws IOException {

        do {
            cosmumeWord();
            System.out.println();
            consumeSpaces();
        } while (!isHash);
    }

    public static void cosmumeWord() throws IOException {
        while ((ch = (char) System.in.read()) != ' ') {
            if (ch == '#') {
                isHash = true;
                break;
            }
            System.out.print(ch + " ");
        }
    }

    public static void consumeSpaces() throws IOException {
        while ((ch = (char) System.in.read()) == ' ');
        if (ch == '#') {
            isHash = true;
        }
        if (!isHash) System.out.print(ch + " ");

    }





}
