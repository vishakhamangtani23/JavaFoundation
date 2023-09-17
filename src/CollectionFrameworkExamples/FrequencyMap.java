package CollectionFrameworkExamples;
import java.util.*;
import java.lang.Math;
public class FrequencyMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            arr[i] = (int)(Math.random()*100);
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
//            System.out.println(freqMap);
        }
        for (Integer key:freqMap.keySet())
        {
            System.out.println(key+" ----> "+freqMap.get(key));
        }
        System.out.println(freqMap);
    }

}
