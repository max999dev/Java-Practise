package collections;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // Concept of stack collection in java is last in first out see example below
        Stack<String> stack = new Stack<>();
        stack.push("Max");
        stack.push("Mariia");

        // pop() method will remove the last String that was pushed in stack
        String one = stack.pop(); // Mariia is first
        String two = stack.pop(); // Max is second
        System.out.println(one);
        System.out.println(two);
        System.out.println(stack); // stack is empty

        // peek() method is working as reader and will pickup only the last pushed string in the stack
        stack.push("Max");
        stack.push("Mariia");
        String three = stack.peek(); // Mariia
        String four = stack.peek(); // Mariia
        System.out.println(three);
        System.out.println(four);
        System.out.println(stack); // [Max, Mariia]

        // Iterating thru the stack

        // Iterator
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // for each loop
        for (String name : stack) {
            System.out.println(name);
        }

        // Lambda
        stack.stream().forEach((element) -> {
            System.out.println(element);
        });
    }
}
