import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();

        String draft = "";
        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        String input = scan.nextLine();
        while (!input.equals("End of game")) {
            int cardOne = Integer.parseInt(scan.nextLine());
            int cardTwo = Integer.parseInt(scan.nextLine());
            if (cardOne > cardTwo) {
                playerOnePoints = cardOne - cardTwo;
            } else if (cardTwo > cardOne) {
                playerTwoPoints = cardTwo - cardOne;
            }
            if (cardOne == cardTwo) {
                if (cardOne > cardTwo) {
                    playerOnePoints = cardOne - cardTwo;
                } else if (cardTwo > cardOne) {
                    playerTwoPoints = cardTwo - cardOne;
                }
            }
            input = scan.nextLine();
        }
        System.out.println(playerOnePoints);
        System.out.println(playerTwoPoints);

    }
}
