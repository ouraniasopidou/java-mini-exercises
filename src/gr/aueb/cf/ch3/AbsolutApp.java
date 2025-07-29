package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εισαγει 1 ακεραιο και εκτυπωνει
 * το απόλυτο
 */

public class AbsolutApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please insert a num");
        num = scanner.nextInt();

        abs = (num > 0 ) ? num : -num;

        System.out.printf("Αbs(%d)= %d", num,abs);
    }
}
