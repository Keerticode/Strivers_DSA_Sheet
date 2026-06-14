import java.util.HashMap;
/*

------> Brute Force approach
    
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;


------>  Better approach

===> This approach is valid even when array contains zero or negatives and this cannot be optimized more if array has zero and -ve's nut we optimize for array containg only +ve integers


public class prblm13 {
    public static void main(String[] args) {

        int[] nums = {2, 0, 0, 0, 4};
        int k = 4;

        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int remaining = sum - k;

            if (preSumMap.containsKey(remaining)) {
                int len = i - preSumMap.get(remaining);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println("Maximum Length = " + maxLen);
    }
}
*/

//  ----->Optimized approach

