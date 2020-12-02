import java.util.Scanner;

public class CLub {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double expectetMoney = Double.parseDouble(scan.nextLine());

        double income = 0.0;

        String input = scan.nextLine();
        for (int i = 0; i <= input.length(); i++) {
            if (input.equals("Party!")) {
                break;
            }
            int cocktale = input.length();
            int count = Integer.parseInt(scan.nextLine());
            double total = cocktale * count ;
            if (total % 2 != 0) {
                total = total - 0.25 * total;
            }

            income += total;
            if (income >= expectetMoney) {
                System.out.println("Target acquired.");
                break;
            }

            input = scan.nextLine();

        }
        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", expectetMoney - income);
        }

        System.out.printf("Club income - %.2f leva.", income);
    }
}
