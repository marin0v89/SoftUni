import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double skumriaPrice = Double.parseDouble(scan.nextLine());  //6.90
        Double cacaPrice = Double.parseDouble(scan.nextLine());     //4.20
        Double palamudKilo = Double.parseDouble(scan.nextLine());   //1.5
        Double safridKilo = Double.parseDouble(scan.nextLine());    //2.5
        int musselsKilo = Integer.parseInt(scan.nextLine());        //1
        double palamud = skumriaPrice + skumriaPrice * 60/100.0;
        double pricePalamud = palamudKilo * palamud;
        double safrid = cacaPrice + cacaPrice * 0.80;
        double priceSafrid = safridKilo * safrid;
        double mussels = musselsKilo * 7.50;
        double total = pricePalamud + priceSafrid + mussels ;
        System.out.printf("%.2f",total);
    }
}
