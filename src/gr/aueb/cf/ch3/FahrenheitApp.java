package gr.aueb.cf.ch3;

/**
 * Διαβάζει ακέραιες θερμοκρασίες Φαρενάιτ
 * (Fahrenheit) και τις μετατρέπει στην κλίμακα Κελσίου.
 * Εκτυπώνει το κατάλληλο μήνυμα,
 * διαβάζει στη συνέχεια την ακέραια θερμοκρασία από
 * τον χρήστη Θα την μετατρέπει στην κλίμακα Κελσίου σύμφωνα με
 * τον τύπο (5/9)(F-32)
 */

import java.util.Scanner;

public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Please insert Fahrenheit temperature");
        fahrenheit = scanner.nextInt();

        celsius =  5 * ( fahrenheit - 32) / 9;

        System.out.println("Celsius Temperature is: " + celsius);
    }
}
