import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());

        String input = scan.nextLine();
        int buyCounter = 0;
        int productBought = 0;
        double totalMoney = 0;

        while (!input.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            buyCounter++;
            if (buyCounter % 3 == 0) {
                price *= 0.5;
            }

            if (budget < price) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", price-budget);
                break;
            }

            productBought ++;
            budget = budget - price;
            totalMoney += price;
            input = scan.nextLine();
            if (input.equals("Stop")){
                System.out.printf("You bought %d products for %.2f leva.",productBought , totalMoney);
            }
        }

    }
}
