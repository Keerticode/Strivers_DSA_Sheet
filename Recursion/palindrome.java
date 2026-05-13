import java.util.Scanner;

public class palindrome {

    public static boolean palindromeCheck(int i, String str, int n) {
     
        if (i >= n / 2) {
            return true;
        }


        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        
        return palindromeCheck(i + 1, str, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int n = str.length();

        boolean result = palindromeCheck(0, str, n);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}