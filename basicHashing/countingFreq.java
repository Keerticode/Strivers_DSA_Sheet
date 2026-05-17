import java.util.*;

public class countingFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hMap.containsKey(arr[i])) {
                int oldFreq = hMap.get(arr[i]);
                hMap.put(arr[i], oldFreq + 1);
            } else {
                hMap.put(arr[i], 1);
            }
        }

        List<List<Integer>> newhash = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            List<Integer> hash = new ArrayList<>();
            hash.add(entry.getKey());
            hash.add(entry.getValue());
            newhash.add(hash);
        }
        System.out.println(newhash);
    }
}