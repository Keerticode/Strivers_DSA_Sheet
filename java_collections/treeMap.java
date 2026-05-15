
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        numbers.remove("Three");
        /*
        if (!numbers.containsKey("Two")) {
        numbers.put("Two", 23);
        }
         */

        // numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());

        /*
         for (Map.Entry<String, Integer> e : numbers.entrySet()){
         System.out.println(e.getKey());
         System.out.println(e.getValue());
          
        }
         */
    }
}
// In tree map the arrangement takes place according to key values and the abovedata type is string so arrangement happens according to strings natural orderwhich is dictionary order.