package gr.aueb.cf.ch3;

/**
 * Υπολογίζει 1+2+3.....+10 με
 * επαναληποτικό τρόπο
 * με while..do
 */

public class Sum10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i; //sum +=i;
            i++;
        }
    }
}
