
import java.util.Scanner;

public class sum {
    public static void sumofnum(int n, int sum, int count) {
        if (count > n) {
            System.out.println("Sum is : " + sum);
            return;
        }

        sum = sum + count;
        sumofnum(n, sum, count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sumofnum(n, 0, 1);
    }
}