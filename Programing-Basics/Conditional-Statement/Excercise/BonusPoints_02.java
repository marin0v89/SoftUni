import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BonusPoints_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;
        if (points <= 100) {
            bonusPoints = 5;
        } else if (points < 1000) {
            bonusPoints = 0.2 * points;
        } else if (points > 1000)
            bonusPoints = 0.1 * points;
        if (points % 2 == 0) {
            bonusPoints += 1;

        } else if (points % 10 == 5) {
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + points);
    }
}
