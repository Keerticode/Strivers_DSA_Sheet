//Reverse a given Array

//solved using two pointer

import java.util.Scanner;

public class arrays2 {
    public static void reverseArray(int l, int r, int arr[]) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(l + 1, r - 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        reverseArray(0, n - 1, arr);
        System.out.println("\nReversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
