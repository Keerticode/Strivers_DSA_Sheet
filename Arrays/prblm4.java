public class prblm4 {
    public static void main(String[] args) {
        
        int[] nums = { 2, 2, 1, 8, 5, 5, 4 };
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        System.out.println(i + 1);
    }
}