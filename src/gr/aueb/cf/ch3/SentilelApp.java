package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Συνεχίζει το διαβασμα μέχρι να δωθεί μια ειδική τιμή
 * (sentinel)
 */
public class SentilelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please insert a num (-1 for exit)");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Please insert a num ( -1 for exit)");
            // num = in.nextInt();
        }

        System.out.println("Positives count: " + iterations);
    }
}
