//Finding smallest and second smallest number in an array using optimized method

public class smallest {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 9, 2, 3, 6, 8 };
        int smallest = nums[0];
        int ssmallest = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < smallest){
                ssmallest = smallest;
                smallest = nums[i];
            }

            else if (smallest < nums[i] && ssmallest > nums[i]) {
                ssmallest = nums[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
        System.out.println("The second smallest number is : " + ssmallest);
    }
}