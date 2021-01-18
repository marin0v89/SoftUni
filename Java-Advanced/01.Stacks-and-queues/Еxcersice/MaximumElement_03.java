package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "1":
                    int element = Integer.parseInt(tokens[1]);
                    numbersStack.push(element);
                    break;
                case "2":
                    if (!numbersStack.isEmpty())
                    numbersStack.pop();
                    break;
                case "3":
                    System.out.println(maximumElement(numbersStack));
                    break;
            }
        }
    }

    private static int maximumElement(ArrayDeque<Integer> numbersStack) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : numbersStack) {
            if (integer>max){
                max = integer;
            }
        }
        return max;
    }
}
