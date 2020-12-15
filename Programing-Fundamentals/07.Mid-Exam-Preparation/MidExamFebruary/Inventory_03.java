package MidExamFebruary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!"Craft!".equals(input)) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            switch (command) {
                case "Collect":
                    String material = tokens[1];
                    if (!items.contains(material)) {
                        items.add(material);
                    }
                    break;
                case "Drop":
                    material = tokens[1];
                    items.remove(material);
                    break;
                case "Combine Items":
                    String[] swapItems = tokens[1].split(":");
                    String oldItem = swapItems[0];
                    String newItem = swapItems[1];
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).equals(oldItem)) {
                            items.add(i + 1, newItem);
                        }
                    }
                    break;
                case "Renew":
                    material = tokens[1];
                    if (items.contains(material)) {
                        items.add(material);
                        items.remove(material);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < items.size(); i++) {
            if (i != items.size() - 1) {
                System.out.print(items.get(i) + ", ");
            } else {
                System.out.print(items.get(i));
            }
        }
    }
}
