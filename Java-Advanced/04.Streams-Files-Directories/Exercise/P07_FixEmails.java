package Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> email = new LinkedHashMap<>();

        int counter = 0;
        String current = "";

        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            if (counter % 2 == 0) {
                email.putIfAbsent(input, "");
                current = input;
            } else {
                if (input.endsWith("us") || input.endsWith("uk") || input.endsWith("com")) {
                    email.remove(current);
                } else {
                    email.put(current, input);
                }
            }

            counter++;
            input = scan.nextLine();
        }
        for (var entry : email.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
