import java.util.HashMap;
import java.util.Map;

public class prblm16 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        int[] nums = {8, 8, 7, 7, 7};
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {

            if(majority.containsKey(nums[i])) {
                int currentFrequency = majority.get(nums[i]);
                majority.put(nums[i], currentFrequency + 1);
            }

            if(!majority.containsKey(nums[i])) {
               majority.put(nums[i], 1);
            }
        }

        int MajElement = 0;

        for(Map.Entry<Integer, Integer> entry : majority.entrySet()) {
            int freq = entry.getValue();
            int key = entry.getKey();
            if(freq > n/2 ) {
                MajElement = key;
            }
        }
        System.out.println("Majority number is : "+ MajElement);
    }
}
