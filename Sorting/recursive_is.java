public class recursive_is {
    public static void insertionSort(int[] nums, int n) {

        if (n == 1) {
            return;
        }

        int j = n - 1;
        insertionSort(nums, n - 1);
        while (j > 0 && nums[j - 1] > nums[j]) {
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums =  {7, 4, 1, 5, 3};
        int n = nums.length;
        insertionSort(nums, n);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
