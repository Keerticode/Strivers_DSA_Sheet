
import java.util.Arrays;



public class arrayClass {
    public static void main(String[] args) {
        /* 
        int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is : " + index);
        */

        Integer[] numbers = { 10, 2, 7, 3, 4, 1, 9, 5, 48, 74};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for(int i : numbers) {
            System.out.println(i + " ");
        }

    }
}
//It can be used in manipulation of array not arraylist