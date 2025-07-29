package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * δινει τον μεσο ορο των μαθηματων
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGrades = 0;
        int gradesCount = 0;
        int average = 0;

        System.out.println("please insert total grades and grades count");
        totalGrades = scanner.nextInt();
        gradesCount = scanner.nextInt();

        if (gradesCount == 0) {
            System.out.println("grades count cannot be zero");
            System.exit(1);
        }

        average = totalGrades / gradesCount;

        if (average < 0 || average > 10) {
            System.out.println("error. the average is not valid");
            System.exit(1);
        }

        if (average >= 9 ) {
            System.out.println("excelent");
        }else if (average >= 7) {
            System.out.println("very good");
        }else if  (average >=5) {
            System.out.println("good");
        }else {
            System.out.println("fail");
        }
    }
}
