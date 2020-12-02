import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int sleeps = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (dates) {
            case "21-23":
                switch (destination) {
                    case "France":
                        price = 30;
                        break;
                    case "Italy":
                        price = 28;
                        break;
                    case "Germany":
                        price = 32;
                        break;
                }
                break;
            case "24-27":
                switch (destination) {
                    case "France":
                        price = 35;
                        break;
                    case "Italy":
                        price = 32;
                        break;
                    case "Germany":
                        price = 37;
                        break;
                }
                break;
            case "28-31":
                switch (destination) {
                    case "France":
                        price = 40;
                        break;
                    case "Italy":
                        price = 39;
                        break;
                    case "Germany":
                        price = 43;
                        break;
                }
                break;

        }
        double total = sleeps * price;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, total);
    }
}

