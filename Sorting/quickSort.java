public class quickSort {

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (nums[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (nums[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    public static void qs(int[] nums, int low, int high) {
        if (low < high) {
            int pIndex = partition(nums, low, high);
            qs(nums, low, pIndex - 1);
            qs(nums, pIndex + 1, high);
        }
        return;
    }

    public static void main(String[] args) {

        int[] nums = { 5, 4, 4, 1, 1 };
        qs(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}