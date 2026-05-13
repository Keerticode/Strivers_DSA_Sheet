import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter q :");
        int q = sc.nextInt();
        while (q > 0) {
            q--;
            System.out.println("Enter number to be counted:");
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
