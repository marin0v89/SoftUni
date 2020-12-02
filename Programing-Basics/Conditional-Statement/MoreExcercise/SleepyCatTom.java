import java.util.Scanner;

public class SleepyCatTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int normPlay = 30000;
        double restDays = days * 127.0;
        double workingDays = (365 - days) * 63.0;
        double total = restDays + workingDays;
        if (total > +normPlay) {
            double rest = total - normPlay;
            double restHours = rest % 60;
            double restMinutes = (rest - restHours) / 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", restMinutes, restHours);
        } else {
            double rest = normPlay - total;
            double restHours = rest % 60;
            double restMinutes = (rest - restHours) / 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", restMinutes, restHours);
        }
    }
}
