package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGames_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> playerOne = readingList(scan);
        List<Integer> playerTwo = readingList(scan);

        boolean flag = true;

        while (flag) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
            } else if (playerTwo.get(0) > playerOne.get(0)) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
            }
            playerOne.remove(playerOne.get(0));
            playerTwo.remove(playerTwo.get(0));

            int sumOne = playersSums(playerOne);
            int sumTwo = playersSums(playerTwo);

            if (sumOne == 0) {
                System.out.println("Second player wins! Sum: " + sumTwo);
                break;
            } else if (sumTwo == 0) {
                System.out.println("First player wins! Sum: " + sumOne);
                flag = false;
                break;
            }
        }
    }


    private static int playersSums(List<Integer> playerOne) {
        int sum = 0;
        for (int integer : playerOne) {
            sum += integer;
        }
        return sum;
    }

    private static List<Integer> readingList(Scanner scan) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = scan.nextLine().split("\\s+");
        for (String part : parts) {
            numbers.add(Integer.valueOf(part));
        }
        return numbers;
    }
}
