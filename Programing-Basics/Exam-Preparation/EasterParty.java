import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        //Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
        //Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
        //Над 20 човека -> 25 % отстъпка от куверта за един човек
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double guestCost = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        if (guests >=10 && guests<=15) {
            guestCost = 0.85 * guestCost;
        } if (guests > 15 && guests <= 20) {
            guestCost = 0.80 * guestCost;
        } if (guests > 20)
            guestCost = 0.75*guestCost;
        double cakePrice = 0.10*budget;
        double total = (guestCost * guests) + cakePrice;
        if (budget > total)
            System.out.printf("It is party time! %.2f leva left.",budget-total);
        else if (total>budget)
            System.out.printf("No party! %.2f leva needed.",total-budget);

    }
}

