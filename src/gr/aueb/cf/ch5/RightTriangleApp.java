package gr.aueb.cf.ch5;

/**
 * ελέγχουμε αν ενα τριγωνο ειναι ορθογωνιο.
 * ο χρηστης εισαγει 3 δεκαδικους που αναπαριστουν τις πλευτρες ενος τριγωνου
 */

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0; //υποτεινουσα
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Παρακαλώ εισάγετε τις 3 πλευρες");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c ) <= EPSILON;
        System.out.println("Triangle is right: " + isRight );
    }
}
