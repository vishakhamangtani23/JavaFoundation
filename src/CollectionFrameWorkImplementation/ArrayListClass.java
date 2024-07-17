package CollectionFrameWorkImplementation;

import java.util.*;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListClass {
    public void CollectionDemo()
    {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(3);
        collection.add(11);
        collection.add(1);
        collection.add(6);
        collection.add(46);
        collection.add(26);
        collection.add(86);
        collection.add(469);
//        System.out.println("It wont work because collection don't have methods like get because it is list specific");
//        collection.get(2);
        for(Integer elem : collection)
        {
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.println("Removing even numbers");
//        concurrently traverse krte krte you cant modify .....
//        use iterator for the same

   /*     for(Integer elem : collection)
        {
            if (elem%2==0)
            {
                collection.remove(elem);
            }

        }

    */


//        Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance of some class that provides a guarantee).
        Iterator<Integer> integerIterator = collection.iterator();
        while (integerIterator.hasNext())
        {
//            System.out.println(integerIterator.next());
            if(integerIterator.next()%2==0)
            {
                integerIterator.remove();
            }
        }
        for(Integer elem : collection)
        {
            System.out.print(elem+" ");
        }
    }
    public  void bulkOperations()
    {

        Collection<Integer> c1 = new ArrayList<>();
        Collection<Integer> c2 = new ArrayList<>();


        for(int i=1;i<5;i++) {
            c1.add(i);
        }

        for(int i=0;i<c1.size();i++) {
            c2.add(i+20);
        }


        System.out.println("C1: " + c1);
        System.out.println("C2 BEFORE: " + c2);
        c2.addAll(c1);
        System.out.println("C2 AFTER ADDING C1 USING ADDALL: " + c2);

//        c2.retainAll(c1); //common elements
//
//        System.out.println("C1: " + c1);
//        System.out.println("C2 RETAINALL: " + c2);


        System.out.println("C1: " + c1);
        System.out.println("C2 : " + c2);
        System.out.println(c2.containsAll(c1)); //c2 is being asked do u have c1 ke all the elements
        //c1.add(44);
        //c2.add(65);
        System.out.println(c2.containsAll(c1)); //common elements
        //c1.addAll(c2);
        System.out.println(c1.containsAll(c2)); //common elements



//        System.out.println("C1: " + c1);
//        System.out.println("C2 CONTAINSALL: " + c2);




    }
    public void arrayConversion()

    {
        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
        integerCollection.add(5);

        Object [] objIntArr = integerCollection.toArray();
        Integer [] intArr = integerCollection.toArray(new Integer[0]);
        for(int i =0;i<objIntArr.length;i++) {
            System.out.println(objIntArr[i]);
            System.out.println((objIntArr[i]));
        }
        for(int i=0;i<intArr.length;i++) {
            System.out.println(intArr[i]);
        }
    }
}
