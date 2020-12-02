import java.util.Scanner;

public class OscarWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //•	Първи ред – име на филм – текст ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        //•	Втори ред– вид на залата – текст ("normal", "luxury" или "ultra luxury")
        //•	Трети ред – брой на закупените билети – цяло число в интервала [1…100]

        String movieTitle = scan.nextLine();
        String roomType = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (roomType.equals("normal")) {
            switch (movieTitle) {
                case "A Star Is Born":
                    price = 7.50;
                    break;
                case "Bohemian Rhapsody":
                    price = 7.35;
                    break;
                case "Green Book":
                    price = 8.15;
                    break;
                case "The Favourite":
                    price = 8.75;
                    break;
            }
        } else if (roomType.equals("luxury")) {
            switch (movieTitle) {
                case "A Star Is Born":
                    price = 10.50;
                    break;
                case "Bohemian Rhapsody":
                    price = 9.45;
                    break;
                case "Green Book":
                    price = 10.25;
                    break;
                case "The Favourite":
                    price = 11.55;
                    break;
            }
        } else if (roomType.equals("ultra luxury")) {
            switch (movieTitle) {
                case "A Star Is Born":
                    price = 13.50;
                    break;
                case "Bohemian Rhapsody":
                    price = 12.75;
                    break;
                case "Green Book":
                    price = 13.25;
                    break;
                case "The Favourite":
                    price = 13.95;
                    break;
            }

        }
        double totalIncome = price * tickets;
        System.out.printf("%s -> %.2f lv.",movieTitle , totalIncome);
    }
}
