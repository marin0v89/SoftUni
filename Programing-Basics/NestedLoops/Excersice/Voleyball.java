import java.util.Scanner;

public class Voleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int weekendsInSofia = 48 - h;
        double gamesInSofia = weekendsInSofia * 3 / 4.0;
        int gamesInHomeTownn = h * 1;
        double gamesWeekendSofia = p * 2 / 3.0;
        double total = gamesInSofia + gamesInHomeTownn + gamesWeekendSofia;
        if (year .equals("leap")){
            total = total + 0.15*total;
        }
        System.out.printf("%.0f",Math.floor(total));
    }
}
