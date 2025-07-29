package gr.aueb.cf.ch5;

/**
 * υπολογιζει την ακολουθια Fibonacci
 */

public class FidoApp {

    public static void main(String[] args) {
        for ( int i =0; i <=20 ; i++) {
            System.out.println(fibonacci(i) + " ");
        }


    }

    public static int fibonacci(int n) {
        if (n == 0 ) {
            return 0;
        }

        if ( n == 1 ) {
            return 1;
        }

        return fibonacci(n-1 ) + fibonacci( n - 2);
    }
}
