
public class prblm11 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 0, 1, 1, 1, 0 };
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            if (nums[i] == 1) {
                count1++;
                if(count1 > count2) {
                    count2 = count1;
                }
            } 
            else if (nums[i] == 0) {
                count1 = 0;
            }
        }
        if(count1 > count2) {
            System.out.println(count1);
        }
        else{
            System.out.println(count2);
        }
    }
}
