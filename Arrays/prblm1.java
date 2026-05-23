//Given an array of integers nums, return the value of the largest element in the array
//Brute Force approach of this problem would be sorting an array and returning n - 1 element.


public class prblm1 {
    public static void main(String[] args) {
        int[] nums = {-4, -3, 0, 1, -8};
        int high = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(high < nums[i]) {
                high = nums[i];
            }
        }
        System.out.println("Highest number : " + high);
    }
}
