import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badGrades = Integer.parseInt(scan.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double gradeSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (failedTimes < badGrades) {
            String problemName = scan.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            gradeSum += grade;
            solvedProblems++;
            lastProblem = problemName;

        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", gradeSum / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }

}
