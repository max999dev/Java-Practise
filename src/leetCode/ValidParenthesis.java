package leetCode;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) { // looping thru the String s for each character
            if (c == '(' || c == '{' || c == '[') { // checking if paranthesis in an open position
                stack.push(c); // adding to the top of the stack
            } else if (c == ')' || c == '}' || c == ']') { // checking if the paranthesis in the close position
                stack.pop(); // removing from the stack
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidParenthesis.isValid("[({})"));
    }
}
