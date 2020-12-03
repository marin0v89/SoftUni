import java.util.Scanner;

public class GraduatingPt2_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double avgGrade = 0;
        int gradeCnt = 0;
        int badGrades = 0;
        while(gradeCnt < 12){
            double grade = Double.parseDouble(scan.nextLine());
            if (grade>=4){
                avgGrade = avgGrade +grade;
                gradeCnt++;
            }else {
                badGrades++;
                if (badGrades>1){
                    break;
                }
            }
        }
        if (gradeCnt ==12){
            avgGrade = avgGrade/gradeCnt;
            System.out.printf("%s graduated. Average grade: %.2f",name ,avgGrade);
        }else {
            System.out.printf("%s has been excluded at %d grade",name ,++gradeCnt);
        }
    }
}
