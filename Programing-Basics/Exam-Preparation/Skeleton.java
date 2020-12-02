import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesControla = Integer.parseInt(scan.nextLine());
        int secondsControla = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        int secondsFor100 = Integer.parseInt(scan.nextLine());
        int controlSecs = (minutesControla * 60) + secondsControla;
        double slow = lenght / 120;
        double slowTime = slow * 2.5;
        double hisTime = (lenght / 100) * secondsFor100 - slowTime;
        if (hisTime <= controlSecs) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", hisTime);
        } else if (hisTime > controlSecs)
            System.out.printf("No, Marin failed! He was %.3f second slower.", hisTime - controlSecs);
    }
}
