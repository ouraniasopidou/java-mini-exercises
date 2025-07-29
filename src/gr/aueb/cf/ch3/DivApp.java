package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * μια απλη διαιρεση
 * diairesh me 0 apaγορευεται
 * δινει ερρορ
 * arithmetic exception
 */

public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("Error, denominator can't be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("result: " + result);


    }
}

