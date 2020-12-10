package Lab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        printGrade(grade);
    }

    private static void printGrade(double grade) {
        String progress = "Fail";
        if (grade >= 3 && grade <= 3.49) {
            progress = "Poor";
        }else if (grade>=3.50&&grade<=4.49){
            progress = "Good";
        }else if (grade>=4.50&&grade<=5.49){
            progress = "Very good";
        }else if (grade>=5.50 && grade<=6){
            progress = "Excellent";
        }
        System.out.println(progress);
    }
}
