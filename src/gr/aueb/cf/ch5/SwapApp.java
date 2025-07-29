package gr.aueb.cf.ch5;

/**
 * αμοιβαια ανταλλασει δυο ακεραιους
 *
 */

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a: %d, b: %d\n",a,b);
        swap(a,b);
        System.out.printf("a: %d, b:%b", a,b);

    }

    /**
     * mutually interchanges the values of
     * two integers
     * @param a the first int
     * @param b the seconde int
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
