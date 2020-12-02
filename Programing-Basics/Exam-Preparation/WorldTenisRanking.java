import java.util.Scanner;

public class WorldTenisRanking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournamentsCnt = Integer.parseInt(scan.nextLine());
        int points = Integer.parseInt(scan.nextLine());

        int startingPoints = 0;
        int total = 0;
        double counter = 0;

        for (int i = 0; i < tournamentsCnt; i++) {
            String input = scan.nextLine();
            switch (input) {
                case "W":
                    startingPoints += 2000;
                    counter++;
                    break;
                case "F":
                    startingPoints += 1200;
                    break;
                case "SF":
                    startingPoints += 720;
                    break;
            }
             total = startingPoints + points;
        }
        int average = startingPoints/tournamentsCnt;

        System.out.println("Final points: " + total);
        System.out.printf("Average points: %d%n",average);
        System.out.printf("%.2f%%",(counter/tournamentsCnt)*100);
    }
}
