package gr.aueb.cf.ch5;

/**
 * Calculate the sum of digits of an int.
 * for example the sum of digits 571 => 13
 */

public class SumOfDigitsApp {

    public static void main(String[] args) {
        int num = 23456789;
        int sumOfDigits = 0;

        sumOfDigits = getSumOfDigits(num);
        System.out.printf("Sum of digits of %d is %d", num,sumOfDigits);

    }

    public static int getSumOfDigits (int num) {
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do {
            rightDigit = left % 10;
            sum += rightDigit;
            left = left / 10;
        } while (left !=0 );

        return sum;
    }
}
