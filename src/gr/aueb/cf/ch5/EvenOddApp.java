package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ελέγχει αν ενας ακεραιος ειναι αρτιος ή περιττος με τη
 * χρήση μεθόδων
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        System.out.printf("%d is even: %b", inputNum, isEven(inputNum));
        System.out.printf("%d is odd: %b", inputNum, !isEven(inputNum));

    }

    /**
     * evaluates if an imput int is even
     * @param a  the input int
     * @return true if is even, false otherwise
     */
    public static boolean isEven (int a) {
        return a % 2 ==0;
    }
}
