//Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

public class prblm3 {
    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 9, 4, 5,};
        System.out.println(isSorted(nums));
    }
}