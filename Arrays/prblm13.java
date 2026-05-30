public class prblm13 {
    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

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

        System.out.println(maxLen);
    }
}