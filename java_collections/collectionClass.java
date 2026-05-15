import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class collectionClass {
    public static void main(String[] args) {
        /* 
        List<Integer> mylist = new ArrayList<>();
        mylist.add(34);
        mylist.add(15);
        mylist.add(10);
        mylist.add(9);
        mylist.add(18);
        mylist.add(2);

        System.out.println("min element " + Collections.min(mylist));
        System.out.println("min element " + Collections.max(mylist));
        System.out.println("min element " + Collections.frequency(mylist, 9));

        Collections.sort(mylist, Comparator.reverseOrder());

        System.out.println(mylist);
        */
       List<student> list = new ArrayList<>();
       list.add(new student("Anuj", 2));
       list.add(new student("Ramesh",4 ));
       list.add(new student("Shivam",3));
       list.add(new student("Rohit", 1));

       student s1 = new student("Anuj", 2);
       student s2 = new student("Rohit", 3);
       //System.out.println(s1.compareTo(s2));

        System.out.println(list);

       Collections.sort(list);

        System.out.println(list);

    }
}

//there are already properties in collection framework but collection class provides some additional properties.