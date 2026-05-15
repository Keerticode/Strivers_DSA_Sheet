import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
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

// in linked hash set the order of elements remains same as we entered not in
// the hashed order