package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        do {
            try {
                System.out.println("please insert numerator and denominator");
                numerator = in.nextInt();
                denominator = in.nextInt();

                result = numerator / denominator;

                System.out.printf("%d / %d = %d", numerator, denominator, result);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Error. Denominator cannot be zero");
            } catch (InputMismatchException e) {
                in.nextLine(); // recover
                System.out.println(" Error. please insert an integer");
            }

            System.out.println(" Thanks for using the app");
        } while ( numerator !=0 );




    }
}
