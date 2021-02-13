package C01.StacksAndQueues.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "1":
                    int number = Integer.parseInt(tokens[1]);
                    numbers.push(number);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    System.out.println(getMaxElement(numbers));
                    break;
            }

        }

    }

    private static int getMaxElement(ArrayDeque<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
