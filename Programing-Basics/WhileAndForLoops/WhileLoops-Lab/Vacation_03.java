import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double needMoney = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());
        //double savings = 0;
        int counter = 0;
        while (ownedMoney < needMoney && counter <5) {
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            if (command.equals("spend")) {
                ownedMoney -= money;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
            if (command.equals("save")) {
                ownedMoney += money;
            }
            counter++;
        }
        if (needMoney >= ownedMoney) {
            System.out.printf("You saved the money for %d days.", counter);
        } else if (needMoney < ownedMoney) {
            System.out.println("You can't save the money.");
            System.out.println(counter);
        }

    }
}
