import java.util.Scanner;

public class FootBallTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int gamesPlayed = Integer.parseInt(scan.nextLine());
        int w = 0;
        int d = 0;
        int l = 0;
        int points = 0;


        for (int i = 1; i <= gamesPlayed; i++) {
            String input = scan.nextLine();

            if (input.equals("W")) {
                w += 1;
                points += 3;
            } else if (input.equals("D")) {
                d += 1;
                points += 1;
            } else {
                l += 1;
            }

        }
        if (gamesPlayed == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        }
        if (gamesPlayed >= 1) {
            double percent = w * 100.0 / gamesPlayed;
            System.out.printf("%s has won %d points during this season.%n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", w);
            System.out.printf("## D: %d%n", d);
            System.out.printf("## L: %d%n", l);
            System.out.printf("Win rate: %.2f%%", percent);

        }
    }
}
