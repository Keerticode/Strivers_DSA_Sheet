import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        /* 
        if (!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }
        */
        
        //numbers.putIfAbsent("Two", 23);
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