package MidExamJune;

import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split("\\s+");

        int[] numbers = new int[parts.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String []function = input.split("\\s+");
            String tokens = function[0];


            switch (tokens) {
                case "swap":
                    int indexOne = Integer.parseInt(function[1]);
                    int indexTwo = Integer.parseInt(function[2]);
                    int temp = numbers[indexOne];
                    numbers[indexOne] = numbers[indexTwo];
                    numbers[indexTwo] = temp;
                    break;
                case "multiply":
                    indexOne = Integer.parseInt(function[1]);
                    indexTwo = Integer.parseInt(function[2]);
                    numbers[indexOne] = numbers[indexOne]*numbers[indexTwo];
                    break;
                case "decrease":
                    int []decrease = {1};
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] =numbers[i]-decrease[0];
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
