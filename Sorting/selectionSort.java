import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");

        int n = sc.nextInt();
        System.out.println("Enter array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array of given array using selection sort is : ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}