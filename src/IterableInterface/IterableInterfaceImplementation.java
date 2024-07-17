package IterableInterface;

import java.util.*;

public class IterableInterfaceImplementation {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(list);
    }


}
