package MidExamFebruaryGroupTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scan.nextLine().split("!"))
                .collect(Collectors.toList());


        String input = scan.nextLine();
        while (!"Go Shopping!".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String item = tokens[1];
            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (shoppingList.contains(item)) {
                        shoppingList.set(shoppingList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.add(item);
                        shoppingList.remove(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        printList(shoppingList);
    }

    private static void printList(List<String> shoppingList) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (i != shoppingList.size() - 1) {
                System.out.print(shoppingList.get(i) + ", ");
            } else {
                System.out.print(shoppingList.get(i));
            }
        }
    }
}


