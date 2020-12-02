import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.	Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
        //2.	Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        //3.	Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
        //4.	Дни за престой - цяло число в интервала [1 … 10000]

        String destination = scan.nextLine();
        String choice = scan.nextLine();
        String discount = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;


        switch (destination) {
            case "Bansko":
            case "Borovets":
                if (choice.equals("withEquipment")) {
                    price = 100;
                    if (discount.equals("yes")) {
                        price = price - 0.10 * price;
                    }
                } else if (choice.equals("noEquipment")) {
                    price = 80;
                    if (discount.equals("yes")) {
                        price = price - 0.05 * price;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (choice.equals("withBreakfast")) {
                    price = 130;
                    if (discount.equals("yes")) {
                        price = price - 0.12 * price;
                    }
                } else if (choice.equals("noBreakfast")) {
                    price = 80;
                    if (discount.equals("yes")) {
                        price = price - 0.07 * price;
                    }
                }
                break;

        }
        double total = days * price;

        if (days > 7) {
            days -= 1;
        }
        if (days <= 0) {
            System.out.println("Days must be positive number!");
        }
        //boolean wrong = (!destination.equals("Bansko") || !choice.equals("withEquipment") || !destination.equals("Borovets") || !choice.equals("noEquipment") || !destination.equals("Varna") || !choice.equals("withBreakfast") || !destination.equals("Burgas") || !choice.equals("noBreakfast"));
        if ((!destination.equals("Bansko") || !choice.equals("withEquipment"))) {
            System.out.println("Invalid input!");
        }
        else if (!destination.equals("Borovets") || !choice.equals("noEquipment")) {
            System.out.println("Invalid input!");
        }
        else if (!destination.equals("Varna") || !choice.equals("withBreakfast")) {
            System.out.println("Invalid input!");
        }
        else if (!destination.equals("Burgas") || !choice.equals("noBreakfast")) {
            System.out.println("Invalid input!");
        }else {
            System.out.printf("The price is %.2flv! Have a nice time!", total);
        }


    }
}
