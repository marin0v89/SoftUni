import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine(); //името на филма
        int movieDays = Integer.parseInt(scan.nextLine()); //дните прожекция
        int tickets = Integer.parseInt(scan.nextLine()); //брой билети
        double ticketPrice = Double.parseDouble(scan.nextLine()); //цена на билетите
        int cinemaProfit = Integer.parseInt(scan.nextLine()); //процента за киното
        double priceOfTickets = tickets * ticketPrice;
        double ticketsPerDay = movieDays * priceOfTickets;
        double percentProfit = (ticketsPerDay * cinemaProfit) / 100;
        double profit = ticketsPerDay - percentProfit;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit);
    }
}
