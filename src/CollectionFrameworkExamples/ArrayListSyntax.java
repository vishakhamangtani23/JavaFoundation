package CollectionFrameworkExamples;

import java.util.*;

//Array List is Ordered
public class ArrayListSyntax {
    public static void main(String[] args) {
        syntaxForArrayList();

    }
    public static void syntaxForArrayList()
    {
//        List<Class> lst = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("Vishu");
        stringList.add("Khushi");
        stringList.add("Mummy");


        String value = stringList.get(2);
        System.out.println("Using Get");
        for(int i =0;i<stringList.size();i++)
        {
            System.out.println(stringList.get(i));
        }
        System.out.println("Using For Each Loop");
        for(String val:stringList)
        {
            System.out.println(val);
        }
        stringList.set(2,"IdkWHO");
        System.out.println(stringList);



    }
}