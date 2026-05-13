import java.util.ArrayDeque;

public class arr_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20);
        adq.offer(30);
        adq.offerFirst(13);
        adq.offerLast(25);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);

    }
}