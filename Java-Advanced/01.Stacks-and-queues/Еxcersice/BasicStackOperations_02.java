package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputData = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(inputData[0]);
        int s = Integer.parseInt(inputData[1]);
        int x = Integer.parseInt(inputData[2]);

        String[] inputNumbers = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(inputNumbers[i]);
            numbersStack.push(number);
        }

        for (int i = 0; i < s; i++) {
            if (!numbersStack.isEmpty()) {
                numbersStack.pop();
            }
        }
        if (numbersStack.contains(x)) {
            System.out.println("true");
        } else if (numbersStack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(minimumElement(numbersStack));
        }
    }

    private static int minimumElement(ArrayDeque<Integer> numbersStack) {
        int min = Integer.MAX_VALUE;

        for (Integer integer : numbersStack) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }
}
