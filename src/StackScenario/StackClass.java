package StackScenario;

import java.util.ArrayDeque;

import java.util.Deque;

    public class StackClass {
        public void offerpollpeek() {
            Deque<Integer> integerStack = new ArrayDeque<>();
            integerStack.offerFirst(1);
            integerStack.offerFirst(2);
            integerStack.offerFirst(3);
            integerStack.offerFirst(4);
            integerStack.offerFirst(5);
            System.out.println(integerStack);

            integerStack.pollFirst();
            System.out.println(integerStack);
            System.out.println(integerStack.peekFirst());
        }
    }

