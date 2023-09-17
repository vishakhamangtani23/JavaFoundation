package CollectionFrameworkExamples;
import java.util.*;
public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        int sum=0;
        for(Integer value : set)
        {
            sum+=value;
        }
        System.out.println(sum);


    }
}
