package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true /false από το standard input
 * για 2 δεξαμενές. Αν και οι δυο έχουν καύσιμα < 1/4
 * τότε ανάβει κόκκινο. Αν η μία απο τις 2 έχει μικρότερο
 * από 1/4 τότε ανάβει πορτοκαλί ένδειξη.
 *
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is less than quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 2 is less than quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isOrange = isLTQuarterTank1 || isLTQuarterTank2;
        isRed = isLTQuarterTank1 ^ isLTQuarterTank2;




    }
}
