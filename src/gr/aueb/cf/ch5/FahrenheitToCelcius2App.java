package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * μετατρέπει βαθμούς Fahrenheit σε Celcius
 */

public class FahrenheitToCelcius2App {

    public static void main(String[] args) {
        for (int i = -100; i <=100; i += 10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i , getCelciusFromFahrenheit(i));
        }
    }

    /**
     * Converts Fahrenhet to Celcius.
     * @param fahrenheitDegrees
     *        the input in Fahrenheit Degrees
     * @return
     *          Celcius Degrees
     */
    public static double getCelciusFromFahrenheit (double fahrenheitDegrees) {
        return (fahrenheitDegrees - 32) * 5 / 9;
    }
}
