import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judges = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        double finalAssessment = 0;
        int countOfCourses = 0;
        while (!input.equals("Finish")){
            countOfCourses ++;
            double resultsForThisCourse = 0;
            double averageResultForThisCourse = 0;

            for (int currentJudge = 0; currentJudge <judges ; currentJudge++) {
                double currentMark = Double.parseDouble(scan.nextLine());
                resultsForThisCourse +=currentMark;
            }
            averageResultForThisCourse = resultsForThisCourse/judges;
            finalAssessment +=averageResultForThisCourse;

            System.out.printf("%s - %.2f.%n",input ,averageResultForThisCourse);
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",finalAssessment/countOfCourses);
    }
}
