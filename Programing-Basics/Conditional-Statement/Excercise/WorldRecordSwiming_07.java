import java.util.Scanner;

public class WorldRecordSwiming_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        double recordTime = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeSeconds = Double.parseDouble(scan.nextLine());
        double swim = distance * timeSeconds;
        double slow = Math.floor(distance / 15);
        double slowTime = slow * 12.5;
        double total = swim + slowTime;
        if (total < recordTime)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
        else if (total >= recordTime)
            System.out.printf("No, he failed! He was %.2f seconds slower.", total - recordTime);
    }
}
