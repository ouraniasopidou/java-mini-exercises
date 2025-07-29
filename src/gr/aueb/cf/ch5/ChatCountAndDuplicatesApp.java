package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Υπολογίζει το πληθος των γραμμάτων καθως και
 * το πλήθος των διπλών γραμμάτων (# for and)
 */

public class ChatCountAndDuplicatesApp {

    public static void main(String[] args) throws IOException {
        char inputChar = ' ';
        int count =0;
        int duplicates = 0;
        char previusChar = '\u007f';

        do {
            inputChar = (char) System.in.read();
            if (inputChar == '#') {
                break;
            }
            count++;

            if (inputChar == previusChar) {
                duplicates++;
            }

            previusChar = inputChar;
        } while (true);

        System.out.println("Count: " + count);
        System.out.println("Duplicates: " + duplicates);
    }
}
