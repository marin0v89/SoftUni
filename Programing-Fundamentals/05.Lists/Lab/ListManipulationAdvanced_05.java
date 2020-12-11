package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            numbers.add(current);
        }

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Contains":
                    checkIfContains(numbers, tokens);
                    break;
                case "Print":
                    printEvenOrOdd(numbers, tokens);
                    break;
                case "Get":
                    int sum = getSum(numbers);
                    System.out.println(sum);
                    break;
                case "Filter":
                    String function = tokens[1];
                    int num = Integer.parseInt(tokens[2]);
                    filteringMethod(numbers, function, num);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println();
    }

    private static void filteringMethod(List<Integer> numbers, String function, int num) {
        for (Integer number : numbers) {
            switch (function) {
                case ">":
                    if (number > num) {
                        System.out.print(number + " ");
                    }
                    break;
                case "<":
                    if (number < num) {
                        System.out.print(number + " ");
                    }
                    break;
                case ">=":
                    if (number >= num) {
                        System.out.print(number + " ");
                    }
                    break;
                case "<=":
                    if (number <= num) {
                        System.out.print(number + " ");
                    }
                    break;
            }
        }
        System.out.println();
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printEvenOrOdd(List<Integer> numbers, String[] tokens) {
        String toDo = tokens[1];
        for (Integer number : numbers) {
            if (toDo.equals("even")) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            } else if (toDo.equals("odd")) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
        }
        System.out.println();

    }

    private static void checkIfContains(List<Integer> numbers, String[] tokens) {
        int numberToCheck = Integer.parseInt(tokens[1]);
        if (numbers.contains(numberToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }
}
