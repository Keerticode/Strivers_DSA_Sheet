//Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1

import java.util.Scanner;

public class prblm8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 3, 4, 5, 3};
        int n = nums.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if(nums[i] == target) {
               index = i;
               break;
            }
        }
        System.out.println("Target appears at : " + index);
    }
}