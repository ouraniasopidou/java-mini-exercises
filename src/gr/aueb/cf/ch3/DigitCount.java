package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει πλήθος των ψηφίων ενός
 * ακεραίου με do/while.
 * Για παράδειγμα αν ο χρήστης δωσει 259, τοτε το πλήθος
 * των ψηφίων είναι 3.
 */

public class DigitCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigits = 0;
        int rhDigit = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();

        copyOfNum = num;

        do {
            count++;
            rhDigit = copyOfNum % 10;
            sumOfDigits = sumOfDigits + rhDigit;
            copyOfNum = copyOfNum / 10;
        } while (copyOfNum != 0);

        System.out.println("Digit-count: " + count);
        System.out.println("Sum of Digits: " + sumOfDigits);
    }
}
