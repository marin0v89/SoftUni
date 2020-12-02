import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String device = scan.nextLine();
        double grade = 0;
        switch (device) {
            case "ribbon":
                switch (country) {
                    case "Russia":
                        grade = 9.100 + 9.400;
                        break;
                    case "Bulgaria":
                        grade = 9.600 + 9.400;
                        break;
                    case "Italy":
                        grade = 9.200 + 9.500;
                        break;
                }
                break;
            case "hoop":
                switch (country) {
                    case "Russia":
                        grade = 9.300 + 9.800;
                        break;
                    case "Bulgaria":
                        grade = 9.550 + 9.750;
                        break;
                    case "Italy":
                        grade = 9.450 + 9.350;
                        break;
                }
                break;
            case "rope":
                switch (country) {
                    case "Russia":
                        grade = 9.600 + 9.000;
                        break;
                    case "Bulgaria":
                        grade = 9.500 + 9.400;
                        break;
                    case "Italy":
                        grade = 9.700 + 9.150;
                        break;
                }
                break;
        }
        double points = 20 - grade;
        double percentage = (points / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.%n",country ,grade ,device);
        System.out.printf("%.2f%%",percentage);
    }
}
