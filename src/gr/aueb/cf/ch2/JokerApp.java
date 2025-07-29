package gr.aueb.cf.ch2;

public class JokerApp {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 45);
        int n2 = (int) (Math.random() * 45);
        int n3 = (int) (Math.random() * 45);
        int n4 = (int) (Math.random() * 45);
        int n5 = (int) (Math.random() * 45);

        int j = (int) (Math.random() * 20);

        System.out.printf("Οι 5 αριθμοι είναι οι %d, %d, %d, %d, %d και Joker το %d", n1,n2,n3,n4,n5,j);
    }
}
