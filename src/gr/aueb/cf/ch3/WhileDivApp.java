package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης δίνει 2 ακεραίους μέχρι
 * ο αριθμνιτής να είναι 0
 * το πρόγραμμα ελέγχει τον παρανομαστή αν είναι
 * 0, και αν είναι 0 δίνει τη δυνατότητα
 * στο χρήστη  να συνβα=εχίσει δίνοντας
 * παρανομαστή διάφορο του 0
 */

public class WhileDivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two  integers for division (numerator 0n for exit)");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0 ) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator/denominator;
            System.out.printf("%d / %d = %d ", numerator, denominator,result);
        }
        System.out.println("GopodBye");

    }
}
