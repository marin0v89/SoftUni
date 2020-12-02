import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        Scanner scan = new Scanner(System.in);
        int paymentYear = Integer.parseInt(scan.nextLine());
        double shoes = 0.60 * paymentYear;
        double trainingSuit = 0.80 * shoes;
        double basketBall = trainingSuit / 4;
        double accsesoaries = basketBall / 5;
        double total = paymentYear + shoes + trainingSuit + basketBall + accsesoaries;
        System.out.printf("%.2f", total);
    }
}
