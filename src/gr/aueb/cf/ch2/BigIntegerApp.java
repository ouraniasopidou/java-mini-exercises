package gr.aueb.cf.ch2;

//import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση BigInteger ώστε να μην
 * έχουμε υπερχείλιση (overflow)
 */

public class BigIntegerApp {
    public static void main(String[] args) {
        java.math.BigInteger myBigNum1 = new java.math.BigInteger("1234567891234567898888886576446546");
        java.math.BigInteger myBigNum2 = new java.math.BigInteger("123456987654");

        java.math.BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("the result = " + result);
        System.out.printf("the result = %,d", result);
    }
}
