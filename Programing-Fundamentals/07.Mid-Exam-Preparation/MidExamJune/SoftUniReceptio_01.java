package MidExamJune;

import java.util.Scanner;

public class SoftUniReceptio_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scan.nextLine());
        int secondEmployee = Integer.parseInt(scan.nextLine());
        int thirdEmployee = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());

        int capacityPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int hourCounter = 0;

        while (studentsCount > 0) {
            hourCounter++;
            if (hourCounter % 4 != 0) {
                studentsCount -= capacityPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hourCounter);
    }
}
