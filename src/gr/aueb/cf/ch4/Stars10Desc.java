package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές από αστεράκια
 * σε φθίνουσα σειρά,
 * 1η γραμμή 10 αστεράκια,
 * 2η γραμμη 9 αστεράκια,
 * κ.ο.κ.
 */

public class Stars10Desc {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++) {
            for (int j = i; j<=10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
