package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * υπολογίζει το εμβαδό ενος παραλληλόγραμμου
 */

public class CalculateReactangleAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width= 0.0;
        double height= 0.0;
        double area = 0.0;


        System.out.println("Παρακαλώ εισάγετε πλάτος και ύψος");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calculateArea(width,height);

        System.out.println("Area: " + area);



    }

    /**
     *
     * @param width το πλάτος του παραλληλογραμμου
     * @param height το ύψος του παραλληλογραμμου
     * @return returns the area of the rectangle
     */
    public static double calculateArea (double width, double height) {
        return width * height;
    }
}
