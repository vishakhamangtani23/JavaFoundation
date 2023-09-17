package CollectionFrameworkExamples;

import java.util.Stack;

public class StackSyntax {
    public static void main(String[] args) {
        syntaxForStack();
    }
    public static void syntaxForStack()
    {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        stack.push(1);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.push(99);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.peek());

        Integer popValue = stack.pop();
        System.out.println(stack);
        System.out.println("Removed Element " + popValue);
        System.out.println(stack.peek());

        System.out.println(stack.capacity());
    }
}
