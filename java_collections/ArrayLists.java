import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);

        System.out.println(mylist);
        mylist.add(1, 4);
        System.out.println(mylist);
        mylist.set(1, 5);
        System.out.println(mylist);

        mylist.remove(1);
        System.out.println(mylist);
        System.out.println(mylist.get(1));

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(6);
        newlist.add(7);
        newlist.add(8);
        mylist.addAll(newlist);
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);

        Iterator<Integer> it = newlist.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
