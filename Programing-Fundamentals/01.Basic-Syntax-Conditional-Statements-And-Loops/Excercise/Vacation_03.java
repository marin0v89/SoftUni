package Excercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grpCnt = Integer.parseInt(scan.nextLine());
        String grpType = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;

        switch (day) {

            case "Friday":
                if (grpType.equals("Students")) {
                    price = 8.45;
                } else if (grpType.equals("Business")) {
                    price = 10.90;
                } else if (grpType.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (grpType.equals("Students")) {
                    price = 9.80;
                } else if (grpType.equals("Business")) {
                    price = 15.60;
                } else if (grpType.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (grpType.equals("Students")) {
                    price = 10.46;
                } else if (grpType.equals("Business")) {
                    price = 16;
                } else if (grpType.equals("Regular")) {
                    price = 22.50;
                }
                break;
        }
        double totalPrice = grpCnt * price;

        if (grpType.equals("Students") && grpCnt >= 30) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        }
        if (grpType.equals("Business") && grpCnt >= 100) {
            totalPrice = totalPrice - (10 * price);
        }
        if (grpType.equals("Regular") && grpCnt >= 10 && grpCnt <= 20) {
            totalPrice = totalPrice / 0.05 * totalPrice;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
