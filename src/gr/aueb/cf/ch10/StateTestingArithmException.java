package gr.aueb.cf.ch10;

import java.util.Scanner;

public class StateTestingArithmException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("please insert numerator and denominator");
        numerator = in.nextInt();
        denominator = in.nextInt();

        if (denominator== 0) {
            System.out.println("Error, denominator cannot be zero");
            System.exit(1);
        }

        result = numerator / denominator;

        System.out.printf(" %d / %d = %d", numerator,denominator ,result);
    }

}
