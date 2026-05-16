import java.util.Scanner;

public class charHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

        int[] hash = new int[26];

        // storing frequency
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter q : ");
        int q = sc.nextInt();

        while (q > 0) {
            q--;

            System.out.print("Enter the character : ");
            char c = sc.next().charAt(0);

            // printing frequency
            System.out.println("Frequency is : " + hash[c - 'a']);
        }
    }
}

// take a string
// create a hash array
// arrange the char into hash array according to the index value
// if repeatation of string takes place then increase the count