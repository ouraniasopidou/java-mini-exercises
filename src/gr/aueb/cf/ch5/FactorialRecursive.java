package gr.aueb.cf.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Facto: " + facto(n));

    }

    public static int facto (int n) {
//        if (n <=1) return 1;
//
//        return  n * facto(n-1);

        return (n <= 1 ) ? 1 : n * facto(n - 1);
    }


}
