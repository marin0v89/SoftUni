import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String []words = scan.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int current = rnd.nextInt(words.length);

            String temp = words[i];
            words[i]=words[current];
            words[current]=temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
