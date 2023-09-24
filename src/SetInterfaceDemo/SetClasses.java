package SetInterfaceDemo;

import java.util.*;

public class SetClasses {
    public void hashSetDemo()
    {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(255);
        hashSet.add(21);
        hashSet.add(055);
        hashSet.add(155);
        System.out.println(hashSet);

        System.out.println("Set Traversing using Iterator");
        Iterator<Integer> integerIterator = hashSet.iterator() ;
        while(integerIterator.hasNext())
        {
            System.out.println(integerIterator.next());
        }

    }
    public void treeSetDemo()
    {
//        Natural Ordering is Maintained
        Set <Integer> treeSet = new TreeSet<>();
        treeSet.add(1444);
        treeSet.add(11);
        treeSet.add(12);
        treeSet.add(155);
        System.out.println(treeSet);
    }
    public void linkedHashSetDemo()
    {
//        insertion ordering
        Set <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1441);
        linkedHashSet.add(127);
        linkedHashSet.add(177);
        System.out.println(linkedHashSet);
    }
    public void removeDuplicatesfromArray()
    {
        String[] words ={"Apple","Mango","Cherry","Jam","All","the","Best","Apple","Mango","For","Your","Exam"};
        Set <String> uniqueWords = new LinkedHashSet<>();
        for(int i =0;i<words.length;i++)
        {
            uniqueWords.add(words[i]);
        }
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());



    }
    public void seperateUnique()
    {
        String[] words ={"Apple","Mango","Cherry","Jam","All","the","Best","Apple","Mango","For","Your","Exam"};
        Set <String> uniqueWords = new LinkedHashSet<>();
        Set <String> repeatedWords = new LinkedHashSet<>();
        for(int i =0;i<words.length;i++)
        {
            if(!uniqueWords.add(words[i]))
            {
                uniqueWords.remove(words[i]);
                repeatedWords.add(words[i]);
            }

        }
        System.out.println(uniqueWords);
        System.out.println(repeatedWords);
    }
    public void bulkOperation()
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s2.add(11);
        s2.add(1);
        s2.add(22);
        s2.add(33);

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        s1.retainAll(s2);
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        s1.addAll(s2);
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        System.out.println(s1.containsAll(s2));
    }
    
}
