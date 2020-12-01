import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        //L – дължина на залата в метри – реално число в интервала  [10.00 … 100.00]
        //
        //W – ширина на залата в метри – реално число в интервала  [10.00 … 100.00]
        //
        //А – страна на гардероба в метри – реално число в интервала [2.00… 20.00]
        Scanner scan = new Scanner(System.in);
        double l = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double a = Double.parseDouble(scan.nextLine());
        double areaHall = (l * 100) * (w * 100);
        double wardrobe = (a * 100) * (a * 100);
        double bench = areaHall * 0.1;
        double realArea = areaHall - wardrobe - bench;
        double dancers = Math.floor(realArea / 7040);
        System.out.printf("%.0f",dancers);

    }
}
