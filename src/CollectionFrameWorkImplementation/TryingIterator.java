package CollectionFrameWorkImplementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TryingIterator {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        c.add(4);
        c.add(5);
        c.add(6);
//        c.add(7);

        Iterator<Integer> integerIterator =  c.iterator();
        while (integerIterator.hasNext())
        {
            System.out.println(integerIterator.next());
            System.out.println("Above printed outside");
            if (integerIterator.next() == 1)
            {
                System.out.println(integerIterator.next());
                System.out.println("Above printed inside");
            }
        }
    }
}
