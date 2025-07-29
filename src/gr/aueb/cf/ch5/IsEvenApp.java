package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή όχι.
 */

public class IsEvenApp {

    public static void main(String[] args) {
        int num = 11;
        boolean isEven = false;

        isEven = isEven(11);

        System.out.printf("%d is even: %b", num, isEven);


    }

    /**
     * returns true if the input is evern, of false
     * if the input number is odd
     * @param num the input num
     * @return
     */
    public static boolean isEven (int num) {
        return num % 2 ==0;
    }
}
