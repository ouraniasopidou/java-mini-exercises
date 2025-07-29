package gr.aueb.cf.ch3;

/**
 * διαβάζει από τον χρήστη 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος
 * και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int year2 = 0;

        System.out.println("Please insert day, month and year");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        year2 = year % 100;

        System.out.printf("%02d/%02d/%d",day,month,year2);
    }
}
