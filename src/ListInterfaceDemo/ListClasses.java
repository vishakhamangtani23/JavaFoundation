package ListInterfaceDemo;

import java.util.*;

public class ListClasses {
    public void list_demo()
    {
//        Collection<Integer> integerList = new ArrayList<>();
//        integerList.get(i);
//        because collection dont have get function
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);

        System.out.println(integerList);

        System.out.println(integerList.get(0));
//        Removing with index
        integerList.remove(1);
        System.out.println(integerList);
//        if we want to remove the number proper the way is to use wrapper class ka object

        integerList.remove(Integer.valueOf(1));
        System.out.println(integerList);

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext())
        {
            Integer element = iterator.next();
            System.out.println(element);
            if(element%2==0)
            {
//                integerList.remove()
//                this will only give concurrent modification exception

                iterator.remove();
            }
        }
        System.out.println(integerList);
    }
    public void listIteratorDemo()
    {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        ListIterator<Integer> listIterator = integerList.listIterator(2);
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("-----------------------------------------------------------------");
//        ListIterator<Integer> listIteratorBack = integerList.listIterator(integerList.size());
        ListIterator<Integer> listIteratorBack = integerList.listIterator(4);
        while (listIteratorBack.hasPrevious())
        {
            System.out.println(listIteratorBack.previous());
        }
    }
}
