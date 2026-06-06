/* 

----> Brute force method : 

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
*/

// ----> Optimized Method

public class prblm6 {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void lrotateArray(int[] nums, int n, int k) {
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = nums.length;
         
        lrotateArray(nums, n, 3);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}