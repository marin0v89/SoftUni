package MidExamAugust;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalPrice = 0;
        double taxPrice = 0;

        while (!"special".equals(input)) {
            if (input.equals("regular")) {
                System.out.println("Invalid order!");
                break;
            }
            double computerParts = Double.parseDouble(input);

            if (computerParts > 0) {
                totalPrice += computerParts;
            } else {
                System.out.println("Invalid price!");
            }


            input = scan.nextLine();
        }
        taxPrice = 0.2 * totalPrice;
        double finalPrice = totalPrice + taxPrice;
        if (input.equals("special")) {
            finalPrice -= finalPrice * 0.10;
        }
        if (finalPrice == 0){
            System.out.println("Invalid price!");
        }else {
            //"Congratulations you've just bought a new computer!
            //Price without taxes: {total price without taxes}$
            //Taxes: {total amount of taxes}$
            //-----------
            //Total price: {total price with taxes}$"
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalPrice);
            System.out.printf("Taxes: %.2f$%n",taxPrice);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",finalPrice);
        }
    }
}
