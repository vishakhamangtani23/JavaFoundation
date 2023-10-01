package QueueInterfaceDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueClass {

    public static void dequeueDemo()
    {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(3);
        System.out.println(queue);
        queue.remove(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.offerFirst(10);
        System.out.println(queue);
        queue.offerFirst(20);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.addLast(9);
        System.out.println(queue);
    }
}
