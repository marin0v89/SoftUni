package Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String key = scan.nextLine();
            String synonym = scan.nextLine();

            List<String> synonymList = new ArrayList<>();
            if (synonyms.containsKey(key)) {
                synonymList = synonyms.get(key);
            }
            synonymList.add(synonym);

            synonyms.put(key, synonymList);

        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),
                    entry.getValue()
                            .toString()
                            .replaceAll("[\\]\\[]", ""));
        }
    }
}
