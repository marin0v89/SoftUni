import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int poolArea = Integer.parseInt(scan.nextLine());
        int pipeOne = Integer.parseInt(scan.nextLine());
        int pipeTwo = Integer.parseInt(scan.nextLine());
        double hours = Double.parseDouble(scan.nextLine());
        char percentage = '%';
        double pipeOneFills = pipeOne * hours;
        double pipeTwoFills = pipeTwo * hours;
        double totalFills = pipeOneFills + pipeTwoFills;
        double percentPipeOne = pipeOneFills * 100 / totalFills;
        double percentPipeTwo = pipeTwoFills * 100 / totalFills;

        if (totalFills <= poolArea) {
            double pp = totalFills * 100 / poolArea;
            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.", pp, percentage, percentPipeOne, percentage, percentPipeTwo, percentage);

        } else {
            double total = totalFills - poolArea;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, total);
        }
    }
}
