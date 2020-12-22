package Lab;

import java.util.Scanner;

public class DigitsLeathersOthers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)) {
                digits.append(current);
            } else if (Character.isAlphabetic(current)) {
                chars.append(current);
            } else {
                others.append(current);
            }
        }
        System.out.println(digits);
        System.out.println(chars);
        System.out.println(others);
    }
}
