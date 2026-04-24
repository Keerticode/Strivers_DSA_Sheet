import java.util.Scanner;
public class one_to_n {
   public static void one_To_n(int n, int count) {
    if(count > n) {
        return;
    }

    System.out.println(count);
    count++;
    one_To_n(n, count);
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n : ");
       int n = sc.nextInt();
       one_To_n(n, 1);
   }
}
