public class prblm12 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        int n = nums.length;
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum = singleNum ^ nums[i];
        }
        System.out.println("The single number is : " + singleNum);
    }
}
