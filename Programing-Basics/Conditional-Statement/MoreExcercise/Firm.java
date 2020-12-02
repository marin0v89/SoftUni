import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        //На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
        //На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
        //На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]
        Scanner scan = new Scanner(System.in);
        int hoursNeed = Integer.parseInt(scan.nextLine());
        int daysAvailable = Integer.parseInt(scan.nextLine());
        int workersOvertime = Integer.parseInt(scan.nextLine());
        double percentStudy = 0.9 * daysAvailable;
        double workingOnProject = percentStudy * 8;
        double overTime = workersOvertime * 2 * daysAvailable;
        double total = Math.floor(workingOnProject + overTime);
        if (total >= hoursNeed) {
            double hoursLeft = total - hoursNeed;
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else if (hoursNeed > total) {
            double hoursLeft = hoursNeed - total;
            System.out.printf("Not enough time!%.0f hours needed.", hoursLeft);
        }

    }
}
