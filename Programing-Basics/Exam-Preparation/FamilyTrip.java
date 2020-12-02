import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //Брой нощувки – цяло число в интервала [0 … 1000]
        //Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //Процент за допълнителни разходи – цяло число в интервала [0 … 100]
        double budget = Double.parseDouble(scan.nextLine());
        int sleeps = Integer.parseInt(scan.nextLine());
        double sleepPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        if (sleeps>7){
            sleepPrice = 0.95*sleepPrice;
        }
        double priceSleep = sleeps * sleepPrice;
        double needs = (budget * percent)/100.0;
        double total = priceSleep + needs;
        if (budget>=total)
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-total);
        else if (total>budget)
            System.out.printf("%.2f leva needed.",total-budget);

    }
}
