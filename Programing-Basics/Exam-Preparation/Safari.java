import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double fuel = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();
        double fuelPrice = fuel * 2.10;
        double fuelWithGuide = fuelPrice + 100;
        if (day.equals("Saturday")) {
            fuelWithGuide = 0.90 * fuelWithGuide;
        } else if (day.equals("Sunday")) {
            fuelWithGuide = 0.80 * fuelWithGuide;
        }
        if (budget >= fuelWithGuide)
            System.out.printf("Safari time! Money left: %.2f lv.", budget - fuelWithGuide);
        else if (fuelWithGuide > budget)
            System.out.printf("Not enough money! Money needed: %.2f lv.", fuelWithGuide - budget);
    }
}
