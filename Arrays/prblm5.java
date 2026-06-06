public class prblm5 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 5, 7 };
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i < n - 1; i++) {
            nums[i - 1] =  nums[i];
        }
        nums[n - 1] = temp;
 
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}