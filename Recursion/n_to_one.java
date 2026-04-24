/*
Print N to 1 using Recursion
Problem Description: Given an integer N, write a program to print numbers from N to 1.
*/

//Forward Recursion
/* 
import java.util.Scanner;

public class n_to_one {
    public static void n_To_one(int n, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count);
        count--;
        n_To_one(n, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        n_To_one(n, n);
    }
}
*/

//Backward Recursion

import java.util.Scanner;

public class n_to_one {
    public static void n_To_one(int n, int count) {
        if (count > n) {
            return;
        }
        n_To_one(n, count + 1);
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        n_To_one(n, 1);
    }
}