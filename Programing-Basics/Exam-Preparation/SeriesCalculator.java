import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serialName = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double comersials = Double.parseDouble(scan.nextLine());
        double comersialTime = (comersials*0.20);
        double episodeTime = comersials+comersialTime;
        double additionalTime = seasons * 10;
        double total = Math.floor(episodeTime * episodes * seasons +additionalTime);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes." ,serialName ,total);
    }
}
