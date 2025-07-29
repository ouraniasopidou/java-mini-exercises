package gr.aueb.cf.ch5;

/**
 * demo of float/doudle expressions
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        long intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum; //int,long, short, byte promotes to float
        resultDouble = doubleNum + floatNum + intNum;

        System.out.printf("Result Float: %.2f\n", resultFloat);
        System.out.printf("Result Double: %.3f",resultDouble);

    }
}
