package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν βρέχει
 * και αυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή.
 * Ο χρήστης εισάγει τα 3 παραπάνω στοιχεία
 * και το πρόγραμμα εκτυπώνει αν τα φώτα
 * ανάβουν ή όχι.
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean isRaining = false;
        Boolean isDark = false;
        Boolean isRunning = false;
        int speed = 0;
        final  int MAX_SPEED = 100;
        Boolean areLightsOn = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert speed of the car");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining  && (isRunning || isDark);


        System.out.println("Lights are on : " + areLightsOn);

    }
}
