package TopJavaCoding;

import java.util.Stack;

/**
 * @Author Bidhu Dash
 * @Date 23-07-2024
 * <p>
 * <p>
 * Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]”
 * are correct in the given expression.
 * <p>
 * Example:
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * Explanation: all the brackets are well-formed
 * Input: exp = “[([]])”
 * Output: Not Balanced
 * Explanation: 1 and 4 brackets are not balanced because
 * there is a closing ‘]’ before the closing ‘(‘
 * <p>
 * [()]{}{[()()]()}[(
 */
public class Exp7_BracketBalance {

    public static void main(String[] args) {

        String pattern = "[()]{}{[()()]()}";
        String pattern1 = "[([]])";

        System.out.println(pattern + " is " + (isBalanced(pattern) ? "Balanced" : "Not Balanced"));
        System.out.println(pattern1 + " is " + (isBalanced(pattern1) ? "Balanced" : "Not Balanced"));
    }

    public static boolean isBalanced(String a) {
        Stack<Character> stack = new Stack<>();
        for (char i : a.toCharArray()) {
            if (i == '{' || i == '(' || i == '[') {
                stack.push(i);
            } else if (i == '}' || i == ')' || i == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '[' && close == ']') || (open == '(' && close == ')') || (open == '{' && close == '}');
    }

}
