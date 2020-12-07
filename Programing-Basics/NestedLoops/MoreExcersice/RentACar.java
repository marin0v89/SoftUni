import java.util.Scanner;

public class RentACar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double carPrice = 0;
        String carType;
        String clas = "";
        if (season.equals("Summer")) {
            carType = "Cabrio";
        } else
            carType = "Jeep";

        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                carPrice = 0.35 * budget;
            } else {
                carPrice = 0.65 * budget;
            }

        } else if (budget > 100 & budget <= 500) {
            clas = "Compact class";
            if (season.equals("Summer")) {
                carPrice = 0.45 * budget;
            } else {
                carPrice = 0.80 * budget;
            }
        } else if (budget > 500) {
            clas = "Luxury class";
            carType = "Jeep";
            carPrice = 0.90 * budget;
        }
        System.out.printf("%s%n", clas);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
