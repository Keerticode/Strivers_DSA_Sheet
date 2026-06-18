//Brute fprce approach
/*

public class prblm15 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

         for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
*/

public class prblm15 {
    public static void main(String[] args) {

        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}