import java.util.Scanner;

public class Graduating_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double avgGrade = 0;
        int gradeCnt = 0;
        while (gradeCnt < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >=4){
                avgGrade = avgGrade +grade;
                gradeCnt ++;
            }

        }
        avgGrade = avgGrade/gradeCnt;
        System.out.printf("%s graduated. Average grade: %.2f",name ,avgGrade);

    }
}
