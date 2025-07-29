package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * bingo app με while .. do
 */

public class WhileDoBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 30;
        int num = 0;

        while (true) {
            System.out.println("please insert a num and guess the secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingoo");
                break;
            } else  {
                System.out.println("Try Again");
            }

        }
        System.out.println("Thank you");

    }
}
