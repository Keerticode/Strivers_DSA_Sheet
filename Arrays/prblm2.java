//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

public class prblm2 {
    public static void main(String[] args) {
        int[] nums = {-5, -4, -10, -1};
        int Large = nums[0];
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (Large < nums[i]) {
                Large = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Large && secLarge < nums[i]) {
                secLarge = nums[i];
            }
        }
        if (secLarge == Integer.MIN_VALUE) {
            secLarge = -1;
        }
        System.out.println("Second Largest number : " + secLarge);

    }
}