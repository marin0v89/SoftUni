package Excersice;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();

        System.out.println(vowelCount(input));
    }

    private static int vowelCount(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
