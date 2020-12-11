package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LisManipulationBasic_04 {
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
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "Insert":
                    numberToAdd = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    numbers.add(index,numberToAdd);
                    break;
            }

            input = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
