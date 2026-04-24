
import java.util.Scanner;

public class names {

    public static void recursion(int n, int count) {
        if (count == n) {
            return;
        }

        System.out.println("Keerti");
        count++;
        recursion(n, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        recursion(n, 0);
    }
}