import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(2);
        queue.offer(10);
        queue.offer(24);
        queue.offer(26);
        queue.offer(11);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        
    }

}
