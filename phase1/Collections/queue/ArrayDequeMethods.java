package queue;
// ArrayDeque = double ended queue
// ArrayDeque is a class that implements Deque interface
// ArrayDeque is a class that implements Queue interface

import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeMethods {
    public static void main(String args[]) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);

        System.out.println(dq);

        dq.poll();
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);

        // with exception
        // dq.remove();
        // dq.removeFirst();
        // dq.removeLast();
        // System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq);

        // stack operations using ArrayDeque
        dq.push(100);
        dq.push(200);

        System.out.println(dq);

        dq.pop();
        dq.pop();
        System.out.println(dq);

        System.out.println(dq.peek()); // dq.peek();

        // queue operations using ArrayDeque
        dq.offer(1000);
        dq.offer(2000);

        System.out.println(dq);

        dq.poll();
        dq.poll();
        System.out.println(dq);


    }
}
