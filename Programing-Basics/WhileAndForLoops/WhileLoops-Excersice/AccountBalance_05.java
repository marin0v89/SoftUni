import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operations = Integer.parseInt(scan.nextLine());
        int number = 1;
        double sum = 0;
        while (number <= operations) {
            double money = Double.parseDouble(scan.nextLine());
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
                System.out.printf("Increase: %.2f%n", money);
                sum += money;


            number++;
        }
        System.out.printf("Total: %.2f", sum);
    }
}
