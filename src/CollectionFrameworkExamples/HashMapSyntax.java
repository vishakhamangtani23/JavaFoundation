package CollectionFrameworkExamples;

import java.util.*;
//This program is for leaning HashMap Syntax
public class HashMapSyntax {
    public static void main(String[] args) {
        syntaxForHashMap();
    }
    public static void syntaxForHashMap()
    {
//        Create Empty Map
//        Map<Key_Clas,Value_Class> var_name = new HashMap<>();
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Vishu");
        hashMap.put(2,"Vish");
        hashMap.put(3,"Visha");
        System.out.println(hashMap);
        hashMap.put(3,"Dance");
        System.out.println(hashMap);
//        Access Values
//        hashmap.get(key)
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(7));
//        HashMap.get gives null value if key is not present and this is because we use classes and Integer class can store null Values
//        Set<Integer> keySet = hashMap.keySet()
        Set <Integer> keys = hashMap.keySet();
        System.out.println(keys);

        for(Integer key:hashMap.keySet())
        {
            String value = hashMap.get(key);
            System.out.println(key);
            System.out.println(value);
        }
        System.out.println(hashMap.values());
        for(String value:hashMap.values())
        {
            System.out.println(value);
        }
//        for searching in MAP
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsKey(11));
//        hap_name.getOrDefault(map,default_value)
        String temp = hashMap.getOrDefault(15,"-1");
        System.out.println(temp);
    }
}
