import java.util.HashMap;

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