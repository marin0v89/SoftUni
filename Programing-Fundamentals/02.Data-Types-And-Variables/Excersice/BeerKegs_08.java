package Excersice;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String newKegVolume = "";
        double acctualVolume = 0;

        for (int i = 0; i < n; i++) {
            String kegType = scan.nextLine();
            double kegRadius = Double.parseDouble(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            if (kegVolume > acctualVolume) {
                acctualVolume = kegVolume;
                newKegVolume = kegType;
            }

        }
        System.out.println(newKegVolume);
    }
}
