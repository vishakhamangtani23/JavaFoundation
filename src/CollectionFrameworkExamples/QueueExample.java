package CollectionFrameworkExamples;
import java.util.*;
//This program is for leaning Queue Syntax
public class QueueExample {
    public static void main(String[] args) {
        Queue <Integer> queue = new ArrayDeque<>();
        System.out.println(queue);

        queue.add(1);
        queue.add(12);
        queue.add(11);
        queue.add(2);
        queue.size();
        queue.remove();
        System.out.println(queue.contains(1));
        System.out.println(queue);
    }
}
