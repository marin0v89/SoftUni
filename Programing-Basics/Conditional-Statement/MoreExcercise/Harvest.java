import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grapeSquare = Integer.parseInt(scan.nextLine());
        double grapeForSquareM = Double.parseDouble(scan.nextLine());
        int wineNeeds = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        double totalProduction = grapeSquare * grapeForSquareM;
        double wine = (0.4 * totalProduction) / 2.5;
        if (wine < wineNeeds) {
            double need = Math.floor(wineNeeds - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", need);
        } else {
            double wineLeft = Math.ceil(wine - wineNeeds);
            double needsForWorkers = Math.ceil(wineLeft / workers);
            double wineWine = Math.ceil(wine);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineLeft, needsForWorkers);
        }
    }
}

