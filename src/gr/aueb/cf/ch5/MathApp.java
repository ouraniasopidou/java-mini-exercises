package gr.aueb.cf.ch5;

/**
 * Demonstrates ceil, floor, random
 */
public class MathApp {

    public static void main(String[] args) {
        double d= 3.45;

        System.out.printf("%.2f: ceil: %d, floor: %d\n", d, getCeil(d), getFloor(d));
        System.out.println("Random value between 1-100: " + getRandom(1,100));

    }

    /**
     * Στρογγυλοποιεί προς τα πάνω
     *
     * @param num the input num
     * @return the rounded result
     */
    public static int getCeil (double num) {
        return (int) Math.ceil(num);
    }

    /**
     * Αποκόπτει τα δεκαδικά στοιχεία του αριθμού που δίνουμε
     *
     * @param num the input num
     *
     */

    public static int getFloor (double num){
        return (int) Math.floor(num);
    }


    /**
     * Returns a random int between min and max
     * @param min the minimum value
     * @param max the maximum value
     * @return a random in between min and max
     */
    public static  int getRandom (int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

