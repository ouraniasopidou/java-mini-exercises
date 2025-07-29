package gr.aueb.cf.ch8;

/**traverse an array
 * means to visit every element and prin the value
 */

public class TranerseArray {

    public static void main(String[] args) {

        int [] ages = {20,25,22,40};

        //simple for with index
        for (int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }

        //enchanced for is safe - no index
        for (int age: ages) {
            System.out.print(age + " ");
        }

    }
}
