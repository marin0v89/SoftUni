import java.util.Scanner;

public class TenisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tenisRacket = Double.parseDouble(scan.nextLine());
        int numberRackets = Integer.parseInt(scan.nextLine());
        int numberShoes = Integer.parseInt(scan.nextLine());
        //1 чифт маратонки = 1/6 от цената на една тенис ракета
        double tenisRacketPrice = tenisRacket*numberRackets;
        double shoesPrice = tenisRacket /6;
        double shoes = numberShoes * shoesPrice;
        double equipmentPrice = (tenisRacketPrice + shoes)*0.2;
        double total = tenisRacketPrice + shoes+equipmentPrice;
        double totalDjokovic = Math.floor(total /8);
        double sponsors = Math.ceil((total*7)/8);
        System.out.printf("Price to be paid by Djokovic %.0f %n" ,totalDjokovic);
        System.out.printf("Price to be paid by sponsors %.0f",sponsors);

    }
}
