package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] parentheses = scan.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean result = true;

        for (char current : parentheses) {
            switch (current) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || stack.pop() != current) {
                        result = false;
                    }
                    break;
                default:
                    break;
            }
            if (!result) {
                break;
            }
        }
        result &= stack.isEmpty();

        System.out.println(result ? "YES" : "NO");

    }
}
