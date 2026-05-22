public class recursive_bs {
    public static void bubbleSort(int[] nums, int n) {
        if(n == 1) {
            return ;
        }

        for(int j = 0; j < n - 1; j++) {
            if(nums[j] > nums[j + 1]) {
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
        bubbleSort(nums, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        int n = nums.length;
        bubbleSort(nums, n);

         for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}