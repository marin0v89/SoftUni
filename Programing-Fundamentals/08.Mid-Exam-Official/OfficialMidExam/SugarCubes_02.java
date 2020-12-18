package OfficialMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SugarCubes_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = readIntList(scan);
        String input = scan.nextLine();
        while (!"Mort".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);
            switch (command) {
                case "Add":
                    numbers.add(value);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(value));
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(tokens[2]);
                    for (int i = 0; i < numbers.size() - 1; i++) {
                        if (numbers.get(i) == value) {
                            numbers.set(i, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    numbers.removeIf(num -> num < value);
                    break;
            }


            input = scan.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
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
