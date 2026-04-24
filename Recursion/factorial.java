// Factorial of a Number : Iterative and Recursive
// Problem Statement: Given a number X,  print its factorial.

import java.util.Scanner;

public class factorial {
    public static void calculateFactorial(int i, int n, int fact) {
        if(i > n) {
            System.out.println("The factorial of n is : " + fact);
            return;
        }
        fact = fact * i;
        calculateFactorial(i + 1, n, fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        calculateFactorial(1, n, 1);
    }
}
