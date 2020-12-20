package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrence_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordsInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordsInLowerCase)) {

                counts.put(wordsInLowerCase, counts.get(wordsInLowerCase) + 1);
            } else {
                counts.put(wordsInLowerCase, 1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();
        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
