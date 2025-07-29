package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Εμφανίζει ένα menu επιλογών με do/while
 * Η do/while εκτελείται οπωσδήποτε 1 φορα
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Επιλέξτε μία απο τις παρακάτω CRUD επιλογές ( 0 για έξοδο) ");
            System.out.println("1. Εισαγωγή προιοντος (insert) ");
            System.out.println("2. Ενημέρωση προιοντος (update)");
            System.out.println("3. Διαγραφή προιοντος (delete)");
            System.out.println("4. Αναζήτηση προιοντος (select)");
            choice = in.nextInt();
        } while (choice != 0);

        System.out.println("Ευχαριστούμε");
    }
}
