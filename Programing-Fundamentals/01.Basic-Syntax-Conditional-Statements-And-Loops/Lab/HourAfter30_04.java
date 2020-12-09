package Lab;

import java.util.Scanner;

public class HourAfter30_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes +=30;
        if (minutes >=60){
            hour++;
            minutes -=60;

        }
        if (hour >=24){
            hour = 0;
        }
        System.out.printf("%01d:%02d",hour,minutes);
    }
}
