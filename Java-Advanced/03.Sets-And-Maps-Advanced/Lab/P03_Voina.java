package Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03_Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> playerOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> playerTwo = new LinkedHashSet<>();

        int[] arrOne = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arrTwo = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int j : arrOne) {
            playerOne.add(j);
        }
        for (int j : arrTwo) {
            playerTwo.add(j);
        }

        for (int i = 0; i < 50; i++) {
            int first = playerOne.iterator().next();
            playerOne.remove(first);
            int second = playerTwo.iterator().next();
            playerTwo.remove(second);

            if (first > second) {
                playerOne.add(first);
                playerOne.add(second);
            } else if (second > first) {
                playerTwo.add(first);
                playerTwo.add(second);
            }
        }
        if(playerOne.size()== playerTwo.size()){
            System.out.println("Draw");
        }else if (playerTwo.size() < playerOne.size()) {
            System.out.println("First player win!");
        } else  {
            System.out.println("Second player win!");
        }
    }
}
