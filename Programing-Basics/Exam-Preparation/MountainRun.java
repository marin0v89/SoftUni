import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double seconds = Double.parseDouble(scan.nextLine()); //5554.36
        Double meter = Double.parseDouble(scan.nextLine());   //1340
        Double timeSec = Double.parseDouble(scan.nextLine()); //3.23
        double goal = meter * timeSec;
        double timeAdd = Math.floor(meter/50);
        double secs = timeAdd * 30;
        double total = goal + secs;
        double loss = total - seconds;
        if (total < seconds)
            System.out.printf(" Yes! The new record is %.2f seconds.",total);
        else
            System.out.printf("No! He was %.2f seconds slower.",loss);
    }
}
