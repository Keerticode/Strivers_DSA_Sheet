public class mergeSort {

    public static void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;

        int k = 0;

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[k] = nums[left];
                left++;
            } else {
                temp[k] = nums[right];
                right++;
            }

            k++;
        }

        while (left <= mid) {
            temp[k] = nums[left];
            left++;
            k++;
        }

        while (right <= high) {
            temp[k] = nums[right];
            right++;
            k++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }

    public static void mSort(int[] nums, int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mSort(nums, low, mid);
        mSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public static void main(String[] args) {

        int[] nums = {7, 2, 5, 3, 1, 4};

        int n = nums.length;

        mSort(nums, 0, n - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}