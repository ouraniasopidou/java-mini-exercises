package gr.aueb.cf.ch2;

/**
 * Output demo
 */

public class OutputApp {
    public static void main(String[] args) {
        int num = 1;
        long num2 = 202345676;

        /*System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");


        System.out.println("Num is: " + num);
        System.out.printf("Num is: %d ", num);*/
        System.out.printf("Νum is: %02d, Num2 is : %,4d", num,num2);
    }
}
