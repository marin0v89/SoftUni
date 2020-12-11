package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = readIntList(scan);

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if ("Delete".equals(command)) {
                int numberToDelete = Integer.parseInt(tokens[1]);
                while (numbers.contains(numberToDelete)) {
                    numbers.remove(Integer.valueOf(numberToDelete));
                }
            } else if ("Insert".equals(command)) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, numberToAdd);
                }
            }

            input = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static List<Integer> readIntList(Scanner scan) {
        String[] parts = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }
        return numbers;
    }
}
