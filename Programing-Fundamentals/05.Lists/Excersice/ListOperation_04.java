package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = readIntList(scan);

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    numberToAdd = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (isValid(numbers,index)) {
                        numbers.add(index, numberToAdd);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (isValid(numbers,index)) {
                        numbers.remove(index);
                    }else {
                        System.out.println("Invalid index");
                    }

                break;
                case "Shift":
                    String position = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if ("left".equals(position)) {
                        for (int i = 0; i < count; i++) {
                            int first = numbers.get(0);
                            numbers.add(numbers.size(), first);
                            numbers.remove(numbers.get(0));
                        }
                    }else if ("right".equals(position)){
                        for (int i = 0; i < count; i++) {
                            int temp = numbers.remove(numbers.size() - 1);
                            numbers.add(0, temp);
                        }
                    }
                    break;
            }

            input = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }
    private static boolean isValid(List<Integer> numbers, int index) {
        boolean result = index >= 0 && index < numbers.size();
        return result;
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
