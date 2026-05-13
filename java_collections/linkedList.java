import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<Integer> mylist = new LinkedList<>();
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
    }
}
//Linked list and array list are almost same