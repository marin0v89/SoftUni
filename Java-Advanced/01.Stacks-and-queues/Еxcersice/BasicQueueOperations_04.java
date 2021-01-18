package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputData = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(inputData[0]);
        int s = Integer.parseInt(inputData[1]);
        int x = Integer.parseInt(inputData[2]);

        String[] inputNumbers = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int numToAdd = Integer.parseInt(inputNumbers[i]);
            numbers.offer(numToAdd);
        }
        for (int i = 0; i < s; i++) {
            if (!numbers.isEmpty()) {
                numbers.poll();
            }
        }
        if (numbers.contains(x)) {
            System.out.println("true");
        } else if (numbers.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(minimumElement(numbers));
        }
    }

    private static int minimumElement(ArrayDeque<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }
}
