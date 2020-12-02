import java.util.Scanner;

public class EasternShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialEggAmount = Integer.parseInt(sc.nextLine());

        int soldEggs = 0;

        String command = "";
        while (!"Close".equals(command = sc.nextLine())) {

            int amount = Integer.parseInt(sc.nextLine());

            switch (command) {
                case "Buy":
                    soldEggs += amount;
                    int eggsNow = initialEggAmount;
                    initialEggAmount -= amount;
                    if (initialEggAmount < 0) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.%n", Math.abs(eggsNow));
                        return;
                    }
                    break;
                case "Fill":
                    initialEggAmount += amount;
                    break;
            }
        }

        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.%n", soldEggs);
    }
}