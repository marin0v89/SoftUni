package Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_AMinersTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> ore = new LinkedHashMap<>();

        String input = scan.nextLine();

        int counter = 0;
        String current = "";

        while (!"stop".equals(input)) {
            if (counter % 2 == 0) {
                current = input;
                ore.putIfAbsent(input, 0);
            } else {
                int oreInt = Integer.parseInt(input);
                ore.put(current, ore.get(current) + oreInt);
            }
            counter++;
            input = scan.nextLine();
        }
        for (var entry : ore.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
