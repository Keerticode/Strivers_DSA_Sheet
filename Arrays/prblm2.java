//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
/* 
Better approach 

public class prblm2 {
    public static void main(String[] args) {
        int[] nums = {-5, -4, -10, -1};
        int Large = nums[0];
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (Large < nums[i]) {
                Large = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Large && secLarge < nums[i]) {
                secLarge = nums[i];
            }
        }
        if (secLarge == Integer.MIN_VALUE) {
            secLarge = -1;
        }
        System.out.println("Second Largest number : " + secLarge);

    }
}
*/
 //optimized way

public class prblm2 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 9, 2, 3, 6, 8 };
        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }
        System.out.println("The largest number :" + largest);
        System.out.println("The Second largest number :" + slargest);
    }
}