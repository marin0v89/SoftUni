package C01.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();

        ArrayDeque<Integer> brackets = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol=='('){
                brackets.push(i);
            }else if(symbol==')'){
                System.out.println(expression.substring(brackets.pop(),i+1));
            }
        }
    }
}
