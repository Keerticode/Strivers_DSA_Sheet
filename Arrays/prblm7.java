//Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.

public class prblm7 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 0, 5, 2};
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}