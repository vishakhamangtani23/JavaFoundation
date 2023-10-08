package MapInterfaceDemo;

import java.util.*;

public class CountingWords {
    public static void main(String[] args) {
        List<String> words = List.of("Vishakha","Hirday","Khushi","Vishakha","Khushi");
//        String [] words = {"Vishakha","Hirday","Khushi","Vishakha","Khushi"};
        Map<String,Integer> hashMap = new HashMap<>();
        for(String word:words)
        {
            hashMap.put(word, hashMap.getOrDefault(word,0)+1);
        }
        System.out.println(hashMap);
//        Second Way
        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+"=======>"+entry.getValue());
        }
    }
}
