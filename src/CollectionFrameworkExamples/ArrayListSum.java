package CollectionFrameworkExamples;

import java.util.*;
public class ArrayListSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // List<Class> var_name = new ArrayList<>();
        List<Integer> lst = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            lst.add(sc.nextInt());
            // sum = sum + lst.get(i);
        }
        for(Integer value : lst) {
            sum += value;
        }
        System.out.println(sum);

        sc.close();
    }
}