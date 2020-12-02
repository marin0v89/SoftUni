import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Първи ред - прожекция - текст с възможности"John Wick", "Star Wars" или "Jumanji"
        //Втори ред - пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
        //Трети ред - брой билети - цяло число в интервала [1… 30]
        String projection = scan.nextLine();
        String choice = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double price = 0;
        if ("John Wick".equals(projection)) {
            switch (choice) {
                case "Drink":
                    price = 12;
                    break;
                case "Popcorn":
                    price = 15;
                    break;
                case "Menu":
                    price = 19;
                    break;
            }
        } else if (projection.equals("Star Wars")) {
            switch (choice) {
                case "Drink":
                    price = 18;
                    break;
                case "Popcorn":
                    price = 25;
                    break;
                case "Menu":
                    price = 30;
                    break;
            }
        } else if (projection.equals("Jumanji")) {
            switch (choice) {
                case "Drink":
                    price = 9;
                    break;
                case "Popcorn":
                    price = 11;
                    break;
                case "Menu":
                    price = 14;
                    break;
            }
        }
        double total = tickets * price;
        if (projection.equals("Star Wars") && tickets >= 4) {
            total = total - 0.30 * total;
        }
        if (projection.equals("Jumanji") && tickets == 2) {
            total = total - 0.15 * total;
        }
        System.out.printf("Your bill is %.2f leva.", total);
    }
}