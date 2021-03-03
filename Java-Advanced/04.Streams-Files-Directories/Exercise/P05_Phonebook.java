package Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> names = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!"search".equals(input)) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];

            names.put(name, phoneNumber);

            input = scan.nextLine();
        }
        String nameRead = scan.nextLine();
        while (!"stop".equals(nameRead)) {
            if (names.containsKey(nameRead)) {
                System.out.printf("%s -> %s%n", nameRead, names.get(nameRead));
            }else {
                System.out.printf("Contact %s does not exist.%n",nameRead);
            }
            nameRead = scan.nextLine();
        }

    }
}

