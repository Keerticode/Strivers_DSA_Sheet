import java.util.Scanner;

public class fibonacci {
    public static int Fib(int n) {
        if (n <= 1) {
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int result = Fib(n);
        System.out.println("Fibonacci of n is : " + result);
    }
}
