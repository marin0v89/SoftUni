package C01.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))) {
                numbers.push(Integer.parseInt(token));
            } else {
                int right = Integer.parseInt(tokens[++i]);
                int left = numbers.peek();
                numbers.push(right);

                int result = token.equals("+")
                        ? left + right
                        : left - right;
                numbers.push(result);
            }
        }
        System.out.println(numbers.peek());
    }
}
