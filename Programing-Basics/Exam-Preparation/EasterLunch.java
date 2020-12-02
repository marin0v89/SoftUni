import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        //Брой козунаци - цяло число в интервала [0 … 99]
        //Брой кори с яйца - цяло число в интервала [0 … 99]
        //Килограми курабии - цяло число в интервала [0 … 99]
        Scanner scan = new Scanner(System.in);
        int easterBread = Integer.parseInt(scan.nextLine());
        int eggCards = Integer.parseInt(scan.nextLine());
        int cookies = Integer.parseInt(scan.nextLine());
        double easterBreadsPrice = 3.20;
        double eggsPRice = 4.35;  //за цяла кора с 12 яйца
        double cookiesPrice = 5.40;  //кило
        double eggPaint = 0.15;  // за яйце
        double totalEasterBread = easterBread * easterBreadsPrice; //цена на козунаци
        double totalEggs = eggCards * eggsPRice;  // цена на яйца
        double totalCookies = cookies * cookiesPrice;  //цена на курабии
        double paint = eggCards * 12 * eggPaint;  //цена за боята за яйце
        double total = totalEasterBread + totalEggs + totalCookies + paint;
        System.out.printf("%.2f",total);
    }
}
