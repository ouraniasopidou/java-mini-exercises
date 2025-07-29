package gr.aueb.cf.ch2;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το
 * αποτέλεσμα στην κονσόλα (standard output)
 */

public class AddApp {
    public static void main(String[] args) {
        // δήλωση και αρχικοποιηση μεταβλητών
        int num1 = 7;
        int num2 = 12;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //εκτύπωση αποτελεσμάτων
        System.out.println("To άθροισμα των " + num1 + " και " + num2 + " είναι: " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι: %d ", num1, num2, result);
    }
}
