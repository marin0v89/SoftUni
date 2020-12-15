package MidExamFebruaryGroupTwo;

import java.util.Scanner;

public class NationalCourt_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int peopleCount = Integer.parseInt(scan.nextLine());

        int maxEfficients = a + b + c;
        int hourCount = 0;

        while (peopleCount > 0) {
            hourCount++;
            if (hourCount % 4 != 0) {
                peopleCount -= maxEfficients;
            }
        }
        System.out.printf("Time needed: %dh.", hourCount);
    }
}
