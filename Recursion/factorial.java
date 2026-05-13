// Factorial of a Number : Iterative and Recursive
// Problem Statement: Given a number X,  print its factorial.
/* 
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
*/

//2nd method
import java.util.Scanner;

public class factorial {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int result = calculateFactorial(n);
        System.out.println("Factorial : " + result);
    }
}
