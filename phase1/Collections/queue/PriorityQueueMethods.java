package queue;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String args[]) {
    
        Queue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);
        q.offer(10);
        q.offer(330);
        q.offer(30);
        q.offer(409);
        System.out.println(q);

        q.poll();
        System.out.println(q);
        System.out.println("First element: " + q.peek());

        System.out.println(q);
    }
    
}
