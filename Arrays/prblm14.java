/* 

----> Brute Force approach

public class prblm14 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
        int target = 12;
        int sum = 0;
        int firstindx = 0;
        int secindx = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    firstindx = i;
                    secindx = j;
                }
                else {
                    sum = 0;
                }
            }
        }
        System.out.println("first Index : "+ firstindx);
        System.out.println("Second Index : "+ secindx);
    }
}

*/
// Optimal using HashMap

import java.util.HashMap;

public class prblm14 {
    public static void main(String[] args) {

        int[] nums = {1, 6, 2, 10, 3};
        int target = 13;

        HashMap<Integer, Integer> twoSum = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if(twoSum.containsKey(remaining)) {
                int idx = twoSum.get(remaining);

                System.out.println(idx);
                System.out.println(i);
            }

            if(!twoSum.containsKey(remaining)) {
                twoSum.put(nums[i],i);
            }
        }
    }
}