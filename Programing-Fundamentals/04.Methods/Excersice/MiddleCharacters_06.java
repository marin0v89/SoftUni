package Excersice;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(middleChar(input));
    }

    private static String middleChar(String input) {
        int position;
        int length;
        if (input.length() % 2 == 0)
        {
            position = input.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = input.length() / 2;
            length = 1;
        }
        return input.substring(position, position + length);
    }
}
