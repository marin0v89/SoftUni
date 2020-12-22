package Excersice;

import java.util.Scanner;

public class ValidUsername_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        for (String word : input) {
            if (isValidUsername(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isValidUsername(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
