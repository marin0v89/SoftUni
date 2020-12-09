package Excercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double sweetPrice = 0;

        String insertMoney = scan.nextLine();
        while (!insertMoney.equals("Start")) {
            double money = Double.parseDouble(insertMoney);
            if (money == 0.1) {
                sum += money;
            } else if (money == 0.2) {
                sum += money;
            } else if (money == 0.5) {
                sum += money;
            } else if (money == 1) {
                sum += money;
            } else if (money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            insertMoney = scan.nextLine();
        }
        String sweets = scan.nextLine();
        while (!sweets.equals("End")) {

            if (sweets.equals("Nuts")) {
                sweetPrice = 2;
                if (sweetPrice <= sum) {
                    System.out.printf("Purchased %s%n", sweets);
                    sum -= sweetPrice;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (sweets.equals("Water")) {
                sweetPrice = 0.7;
                if (sweetPrice <= sum) {
                    System.out.printf("Purchased %s%n", sweets);
                    sum -= sweetPrice;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (sweets.equals("Crisps")) {
                sweetPrice = 1.5;
                if (sweetPrice <= sum) {
                    System.out.printf("Purchased %s%n", sweets);
                    sum -= sweetPrice;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (sweets.equals("Soda")) {
                sweetPrice = 0.8;
                if (sweetPrice <= sum) {
                    System.out.printf("Purchased %s%n", sweets);
                    sum -= sweetPrice;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (sweets.equals("Coke")) {
                sweetPrice = 1;
                if (sweetPrice <= sum) {
                    System.out.printf("Purchased %s%n", sweets);
                    sum -= sweetPrice;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else {
                System.out.println("Invalid product");
            }

            sweets = scan.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
