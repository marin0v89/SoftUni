import java.util.Scanner;

public class HotelRoom_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int sleeps = Integer.parseInt(scan.nextLine());
        double studio = 0;
        double apartment = 0;
        //May, June, July, August, September или October
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }
        //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
        if ((sleeps > 7) && (sleeps < 14) && (month.equals("May") || month.equals("October"))) {
            studio = studio - 0.05 * studio;
        }
        if (sleeps > 14 && (month.equals("May") || month.equals("October"))) {
            studio = studio - 0.30 * studio;
        }
        if (sleeps > 14 && (month.equals("June") || month.equals("September"))) {
            studio = studio - 0.20 * studio;
        }
        if (sleeps > 14) {
            apartment = apartment - 0.10 * apartment;
        }
        System.out.printf("Apartment: %.2f lv.%n", sleeps * apartment);
        System.out.printf("Studio: %.2f lv.", sleeps * studio);
    }
}
