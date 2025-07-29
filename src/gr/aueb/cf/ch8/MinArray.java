package gr.aueb.cf.ch8;



public class MinArray {

    public static void main(String[] args) {
        int [] arr = {7,3,9,6,2,12};
        int minPosition;
        minPosition = findMin(arr);

        System.out.printf("Min value: %d. min position: %d", arr[minPosition],minPosition + 1);


    }

    /**
     * returns the position of min element
     * @param arr
     * @return
     */
    public static int findMin (int[] arr) {
        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i =0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr [i];
                minPosition = i;
            }
        }
        return minPosition;

    }
}
