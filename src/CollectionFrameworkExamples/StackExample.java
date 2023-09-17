package CollectionFrameworkExamples;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt()   ;
     Stack<Integer> stack = new Stack<>();
     for(int i =0;i<n;i++)
     {
         stack.push(sc.nextInt());
     }
        System.out.println(stack);
     while(!stack.isEmpty())
     {
         stack.pop();
     }
        System.out.println(stack);
    }
}
