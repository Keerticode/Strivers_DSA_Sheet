
import java.util.Scanner;

public class prblm6 {
    public static void lrotateArray(int[] nums, int n, int k) {
        k = k % n;

        int[] temp = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for(int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
       
        int[] nums = new int[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        lrotateArray(nums, n, 3);
        System.out.print("The rotated array is : ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
