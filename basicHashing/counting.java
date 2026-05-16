import java.util.Scanner;

public class counting {
    //numbers hashing
    static int[] hash = new int[1000000000]; // global/static variable

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

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

        sc.close();
    }
}

//This is number hashing and if there is a prblm which requires number hashing,we use arrays to hash them and we can also do character hashing using arrays.