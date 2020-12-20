package Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> chars = new LinkedHashMap<>();

        String []word = scan.nextLine().split(" ");

        for (String s : word) {

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (chars.containsKey(ch)) {
                    chars.put(ch, chars.get(ch) + 1);
                } else {
                    chars.put(ch, 1);
                }
            }
        }
        chars
                .forEach((key, value) -> System.out.printf("%s -> %d%n"
                        , key, value));

    }
}
