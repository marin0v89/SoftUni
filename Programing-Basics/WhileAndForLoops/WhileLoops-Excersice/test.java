import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalIncomesCount = Integer.parseInt(scanner.nextLine());
        int countIncomes = 1;
        double totalMoney = 0;
        while (countIncomes <= totalIncomesCount) {
            double money = Double.parseDouble(scanner.nextLine());
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                totalMoney += money;
                System.out.printf("Increase: %.2f%n", money);
            }
            countIncomes++;
        }

        System.out.printf("Total: %.2f", totalMoney);


    }
}

