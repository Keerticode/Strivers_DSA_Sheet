import java.util.*;

public class mapHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> hMap = new HashMap<>();

        // frequency hashing
        for (int i = 0; i < arr.length; i++) {

            if (hMap.containsKey(arr[i])) {

                int oldFreq = hMap.get(arr[i]);     //1. Take current array element 2. Use it as key in HashMap 3. Return its frequency

                hMap.put(arr[i], oldFreq + 1);

            } else {

                hMap.put(arr[i], 1);
            }
        }

        System.out.print("Enter q : ");
        int q = sc.nextInt();

        while (q > 0) {

            q--;

            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if (hMap.containsKey(num)) {
                System.out.println("Frequency : " + hMap.get(num));
            } else {
                System.out.println("Frequency : 0");
            }
        }
    }
}

// take a input of an array
// create a hash map
// pre compute the hash map run the loop for hash map taking array as an index
// check the frequency of a numbers in array
// take a input of number of queries you want to run
// run a while loop
// decrement the query
// fetch the hash map created above
// print the frequencies