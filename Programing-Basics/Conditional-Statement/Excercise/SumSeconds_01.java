import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secondOne = Integer.parseInt(scan.nextLine());
        int secondTwo = Integer.parseInt(scan.nextLine());
        int secondThree = Integer.parseInt(scan.nextLine());
        int totalTime = secondOne + secondTwo + secondThree;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (seconds < 10)
            System.out.printf("%d:0%d",minutes ,seconds);
        else
            System.out.printf("%d:%d",minutes,seconds);
    }
}
