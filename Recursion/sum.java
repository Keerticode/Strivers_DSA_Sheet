//Sum of First N Numbers
//Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

import java.util.Scanner;

public class sum {
    public static void sumOfnum(int i, int n, int sum) {
        if (i > n) {
            System.out.println("The sum of n numbers is : " + sum);
            return;
        }
        System.out.println(i);
        sum = sum + i;
        sumOfnum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sumOfnum(0, n, 0);
    }
}
