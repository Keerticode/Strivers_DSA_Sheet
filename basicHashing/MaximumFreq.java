/*The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

Solved this using brute force method

*/

import java.util.Arrays;

public class MaximumFreq {

    public static int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int maxFreq = 1;

        for (int i = 0; i < nums.length; i++) {

            int target = nums[i];
            int operations = 0;
            int count = 1;

            for (int j = i - 1; j >= 0; j--) {

                operations += target - nums[j];

                if (operations > k) {
                    break;
                }

                count++;
            }

            maxFreq = Math.max(maxFreq, count);
        }

        return maxFreq;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 4 };
        int k = 5;

        int ans = maxFrequency(nums, k);

        System.out.println("Maximum Frequency: " + ans);
    }
}