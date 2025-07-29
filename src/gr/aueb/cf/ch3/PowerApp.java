package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το base ^ στην power.
 * Ο χρήστης δίνει τα base, power.
 */

public class PowerApp {

    public static void main(String[] args) {
        //Δηλωση & Αρχικοποίηση μεταβλητων

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert base and power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
           result *= base; //result = result * base;
            i++;
        }

        System.out.printf("%d ^ %d = %,d ", base, power, result);
    }

}
