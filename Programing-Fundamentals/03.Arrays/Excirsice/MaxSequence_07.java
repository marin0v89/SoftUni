package Excirsice;

import java.util.Scanner;

public class MaxSequence_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];
            if (currentElement == nextElement) {
                counter++;
                if (counter > maxCount) {
                    maxCount = counter;
                    digit = currentElement;
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }
    }
}
