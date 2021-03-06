package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        ArrayDeque<Integer> indexesOfOpeningBrackets = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (symbol == '(') {
                indexesOfOpeningBrackets.push(i);
            } else if (symbol == ')') {

                System.out.println(expression.substring(indexesOfOpeningBrackets.pop(), i + 1));
            }
        }
    }
}
