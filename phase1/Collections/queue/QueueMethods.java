package queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    /**
     * This is the main method that demonstrates the usage of methods in the Queue interface.
     * It creates a Queue of integers, adds elements to it, removes elements from it,
     * retrieves the first element, checks if the queue is empty, and prints the elements.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Queue to store integers
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue
        q.offer(10);  // Add element 10
        q.offer(20);  // Add element 20
        q.offer(30);  // Add element 30
        q.offer(40);  // Add element 40

        // Print the queue
        System.out.println(q);

        // Remove the first element from the queue
        q.poll();
        System.out.println(q);

        // Retrieve the first element from the queue without removing it
        System.out.println("First element: " + q.peek());

        // Remove and print all elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        // Since the queue is empty, calling poll() will return null
        System.out.println("poll() after queue is empty: " + q.poll());

    }
}