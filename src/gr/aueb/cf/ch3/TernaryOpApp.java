package gr.aueb.cf.ch3;

import java.util.Scanner;

/**υπολογίζει το μιν μαχ με τριαδικό
 * τελεστή
 */

public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("please insert 2 integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //if ( num1 < num2) min

        min = (num1 <num2) ? num1 : num2;

        System.out.printf("the min of (%d, %d) is %d", num1,num2,min);

    }
}
