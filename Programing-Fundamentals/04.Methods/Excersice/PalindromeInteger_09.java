package Excersice;

import java.util.Scanner;

public class PalindromeInteger_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!"END".equals(input)) {
            if (input.equals(reverseInput(input))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scan.nextLine();
        }
    }

    private static String reverseInput(String input) {
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        return reverse;
    }
}
