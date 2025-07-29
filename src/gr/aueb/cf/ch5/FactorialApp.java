package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογίζει το παραγοντικό του ν
 * με τη χρηση της μεθοδου facto
 * n! = 1 * 2 *3 ...*n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        int a = 2;
        int b = 10;

        System.out.println("Please insert n");
        n = in.nextInt();

        System.out.printf("%d! = %d", n , facto(n));
        System.out.printf("%d^%d= %d", a,b ,pow(a,b));

    }

    public static int facto (int n) {
        int result = 1;

        for (int i = 1; i<=n; i++ ) {
            result *= i;
        }

        return result;
    }

    //a^b
    public static int pow (int a,int b) {
        int pow = 1;

        for (int i= 1; i<=b; i++) {
            pow *= a;
        }
        return pow;
    }
}
