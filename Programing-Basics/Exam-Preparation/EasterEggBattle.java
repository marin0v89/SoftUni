import java.util.Scanner;

public class EasterEggBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int playerOne = Integer.parseInt(scan.nextLine());
        int playerTwo = Integer.parseInt(scan.nextLine());

        while (0 < playerOne  && 0 < playerTwo) {

            String input = scan.nextLine();
            if (input.equals("one")) {
                playerTwo--;
            }
            if (input.equals("two")) {
                playerOne--;
            }
            if (input.equals("End of battle")) {
                break;
            }
        }
        if (playerOne > playerTwo) {
            System.out.print("Player two is out of eggs. ");
            System.out.println("Player one has " + playerOne + " eggs left.");
        } else if (playerOne < playerTwo) {
            System.out.print("Player one is out of eggs. ");
            System.out.println("Player two has " + playerTwo + " eggs left.");
        } else {
            System.out.println("Player one has " + playerOne + " eggs left.");
            System.out.println("Player two has " + playerTwo + " eggs left.");
        }
    }
}
