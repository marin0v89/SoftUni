import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());

        int mousalaGroup = 0;
        int monblanGroup = 0;
        int kilimandjaroGroup = 0;
        int k2Group = 0;
        int everestGroup = 0;
        double total = 0;

        for (int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(scan.nextLine());

            if (peopleInGroup <= 5) {
                mousalaGroup += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblanGroup += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaroGroup += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Group += peopleInGroup;
            } else {
                everestGroup += peopleInGroup;
            }
            total += peopleInGroup;

        }
        System.out.printf("%.2f%%%n", mousalaGroup / total * 100);
        System.out.printf("%.2f%%%n", monblanGroup / total * 100);
        System.out.printf("%.2f%%%n", kilimandjaroGroup / total * 100);
        System.out.printf("%.2f%%%n", k2Group / total * 100);
        System.out.printf("%.2f%%%n", everestGroup / total * 100);
    }
}
