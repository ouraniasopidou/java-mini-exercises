package gr.aueb.cf.ch5;

/**
 * προσθετει 2 ακεραιους με τη χρηση
 * μεθοδου
 */

public class AddAp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;
        result = add(a,b);

        System.out.printf("%d + %d = %d\n", a,b,result);
        System.out.println("Result: " + result);

    }
    public static int add (int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return a + b;
    }

}
