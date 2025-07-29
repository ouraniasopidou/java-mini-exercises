package gr.aueb.cf.ch2;

/**
 * Template for programming
 * Πολλαπλασιαζει δύο ακεραίους
 * και εκτυπώνει το αποτέλεσμα στην κονσόλα.
 */
public class Output2App {

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 500;
        int totalPrice= 0;

        //εντολές\
        totalPrice= price * quantity;

        //εκτύπωση αποτελεσμάτων
        System.out.printf("Price: %3d, Quantity: %d, Total Price: %,d\n", price,quantity,totalPrice);
    }
}
