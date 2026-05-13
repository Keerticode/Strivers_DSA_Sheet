import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //we can see the change of order here because under the hood minheap algorithm has been implemented and in minheap smallest element will be at top

        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(24);
        pq.offer(26);
        pq.offer(11);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}