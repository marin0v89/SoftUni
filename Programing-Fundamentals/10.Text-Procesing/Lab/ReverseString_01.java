package Lab;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordToReverse = scan.nextLine();

        StringBuilder reversed = new StringBuilder();

        while (!"end".equals(wordToReverse)) {
            reversed = reverseString(wordToReverse, wordToReverse.length());
            System.out.println(wordToReverse + " = " + reversed);
            wordToReverse = scan.nextLine();
        }
    }

    private static StringBuilder reverseString(String word, int length) {
        StringBuilder reversed = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed;
    }
}
