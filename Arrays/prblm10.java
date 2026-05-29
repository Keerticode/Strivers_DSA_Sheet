
public class prblm10 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int n = nums.length;
        int expectedSum = n*(n + 1)/2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }
        int missingNum = expectedSum - actualSum;
        System.out.println("The missing number is : " + missingNum);
    }
}