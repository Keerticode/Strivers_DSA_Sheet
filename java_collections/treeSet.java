import java.util.HashSet;
import java.util.Set;
public class treeSet {
    public static void main(String[] args) {
        /* 
        Set<Integer> set = new TreeSet<>();

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
        */

        //to create a set other than primitive data type like custom type we cannot create it generically and below we have created class and created its set.

        Set<student> studentSet = new HashSet<>();
 
        studentSet.add(new student("Anusha", 2));
        studentSet.add(new student("keerti", 3));
        studentSet.add(new student("Ananya", 5));
        studentSet.add(new student("Ritesh", 4));
        
        student s1 = new student("rakesh", 2);
        student s2 = new student("rahul", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);

    }
}
 
//tree set will be implementing itself on binary search tree and all the elements will be unique and sorted in ascending order
