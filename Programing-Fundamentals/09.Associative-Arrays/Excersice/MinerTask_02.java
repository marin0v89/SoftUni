package Excersice;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            String resources = input;
            int quantity = Integer.parseInt(scan.nextLine());

            materials.putIfAbsent(resources, 0);
            materials.put(resources, materials.get(resources) + quantity);

            input = scan.nextLine();
        }
        for (var entry : materials.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
