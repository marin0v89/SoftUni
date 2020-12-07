import java.util.Scanner;

public class Journey_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String somewhere = "";
        String roomType = "";
        double expences = 0;
        if (budget <= 100) {
            somewhere = "Bulgaria";
        } else if (budget <= 1000) {
            somewhere = "Balkans";
        } else if (budget > 1000) {
            somewhere = "Europe";
        }
        switch (season) {
            case "summer":
                roomType = "Camp";
                break;
            case "winter":
                roomType = "Hotel";
                break;
        }
        if (somewhere.equals("Europe") && (season.equals("summer") || season.equals("winter"))) {
            roomType = "Hotel";
        }
        if (budget <= 100 && somewhere.equals("Bulgaria")) {
            if (season.equals("summer")) {
                expences = 0.30 * budget;
            } else if (season.equals("winter")) {
                expences = 0.70 * budget;
            }
        } else if (budget <= 1000 && somewhere.equals("Balkans")) {
            if (season.equals("summer")) {
                expences = 0.40 * budget;
            } else if (season.equals("winter")) {
                expences = 0.80 * budget;
            }
        }else if (budget > 1000 && somewhere.equals("Europe")){
            if (season.equals("summer")||season.equals("winter")){
                expences = 0.90 * budget;
            }
        }
        System.out.printf("Somewhere in %s%n", somewhere);
        System.out.printf("%s - %.2f", roomType, expences);
    }
}
