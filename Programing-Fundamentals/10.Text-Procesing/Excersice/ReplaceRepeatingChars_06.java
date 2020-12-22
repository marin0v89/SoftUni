package Excersice;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = scan.nextLine();

        char base = input.charAt(0);
        sb.append(base);

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != base) {
                sb.append(current);
                base = current;
            }
        }
        System.out.println(sb);
    }
}
