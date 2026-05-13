import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(12);
        set.add(10);
        set.add(18);
        set.add(15);

        System.out.println(set);
        set.remove(32);
        System.out.println(set);

        System.out.println(set.contains(12));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }
}
