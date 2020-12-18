package OfficialMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> cards = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(", ");

            String command = tokens[0];
            switch (command) {
                case "Add":
                    String cardName = tokens[1];
                    if (cards.contains(cardName)) {
                        System.out.println("Card is already bought");
                    } else {
                        cards.add(cardName);
                        System.out.println("Card successfully bought");
                    }
                    break;
                case "Remove":
                    cardName = tokens[1];
                    if (cards.contains(cardName)) {
                        cards.remove(cardName);
                        System.out.println("Card successfully sold");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(tokens[1]);
                    if (index > cards.size()) {
                        System.out.println("Index out of range");
                        break;
                    } else {
                        cards.remove(index);
                        System.out.println("Card successfully sold");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(tokens[1]);
                    cardName = tokens[2];
                    if (index > cards.size()) {
                        System.out.println("Index out of range");
                        break;
                    } else {
                        if (cards.contains(cardName)) {
                            System.out.println("Card is already bought");
                        } else {
                            cards.add(index, cardName);
                            System.out.println("Card successfully bought");
                        }
                    }
                    break;
            }
        }
        printList(cards);
    }

    private static void printList(List<String> cards) {
        for (int i = 0; i < cards.size(); i++) {
            if (i == cards.size() - 1) {
                System.out.print(cards.get(i));
            } else {
                System.out.print(cards.get(i) + ", ");
            }
        }
    }
}
