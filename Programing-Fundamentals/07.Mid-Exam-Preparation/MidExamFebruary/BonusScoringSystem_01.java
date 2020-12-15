package MidExamFebruary;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scan.nextLine());
        int lecturesCount = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());

        double maxBonus = 0;
        int attendance = 0;
        for (int i = 0; i < studentsCount; i++) {
            int attendanceCount = Integer.parseInt(scan.nextLine());

            double bonus = Math.ceil(attendanceCount * 1.0 / lecturesCount * (5 + additionalBonus));
            if (attendanceCount > attendance) {
                maxBonus = bonus;
                attendance = attendanceCount;
            }
        }
        //"Max Bonus: {maxBonusPoints}."
        //"The student has attended {studentAttendances} lectures."
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", attendance);
    }
}
