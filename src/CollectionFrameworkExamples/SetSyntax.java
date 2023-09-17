package CollectionFrameworkExamples;

import java.util.*;

public class SetSyntax {
    public static void main(String[] args) {
        syntaxForSet();

    }
    public static void syntaxForSet()
    {
        Set<Integer> set = new HashSet<>();
        System.out.println(set);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);
        System.out.println(set.size());
        System.out.println(set);
        for(Integer value:set)
        {
            System.out.println(value);
        }
//        Searching
        System.out.println(set.contains(3));
        System.out.println(set.contains(9));
        System.out.println(set.contains(10));

//        Remove Function
        set.remove(4);
        System.out.println(set);
    }
}
