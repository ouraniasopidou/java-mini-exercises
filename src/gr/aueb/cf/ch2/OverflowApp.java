package gr.aueb.cf.ch2;

/**
 * Ελέγχει την υπερχείληση στην περίπτωση που συμβεί.
 */

public class OverflowApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση Αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
