package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWord = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : bannedWord) {
            String stars = replaceWords(word.length());

            text = text.replace(word, stars);
        }
        System.out.println(text);

    }

    private static String replaceWords(int length) {
        List<String> replacement = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            replacement.add("*");
        }
        return String.join("", replacement);
    }
}
