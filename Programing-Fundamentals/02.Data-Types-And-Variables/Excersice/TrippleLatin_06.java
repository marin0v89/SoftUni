package Excersice;

import java.util.Scanner;

public class TrippleLatin_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 'a'; i <'a'+n ; i++) {
            for (int j = 'a'; j <'a'+n ; j++) {
                for (int k = 'a'; k <'a'+n ; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
