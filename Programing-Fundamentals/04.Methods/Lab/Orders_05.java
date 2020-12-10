package Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00
        switch (product) {
            case "coffee":
                printCoffee(quantity);
                break;
            case "water":
                printWater(quantity);
                break;
            case "coke":
                printCoke(quantity);
                break;
            case "snacks":
                printSnacks(quantity);
                break;
        }

    }

    private static void printSnacks(double quantity) {
        System.out.printf("%.2f",quantity*2);
    }

    private static void printCoke(double quantity) {
        System.out.printf("%.2f",quantity*1.40);
    }

    private static void printWater(double quantity) {
        System.out.printf("%.2f",quantity*1);
    }

    private static void printCoffee(double quantity) {
        System.out.printf("%.2f",quantity*1.50);
    }
}
