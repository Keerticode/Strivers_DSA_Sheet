import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int didSwap = 0;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    didSwap = 1;
                }
            }

            if (didSwap == 0) {
                break;
            }
        }

        System.out.println("Sorted array of given array using bubble sort is : ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// if array is already sorted then to reduce the time complexity and optimize
// the program we add the didSwap.