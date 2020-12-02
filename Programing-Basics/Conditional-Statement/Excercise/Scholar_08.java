import java.util.Scanner;

public class Scholar_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double grades = Double.parseDouble(scan.nextLine());
        double minIcome = Double.parseDouble(scan.nextLine());
        double social = 0.0;
        double grade = 0.0;
        if  (grades >=5.50){
            grade = Math.floor(grades*25);
        }
        else if (grades > 4.50){
            if (minIcome > income){
                social = Math.floor(minIcome * 0.35);
            }
        }
        if (grade > social){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",grade);
        }
        else if (social > grade){
            System.out.printf("You get a Social scholarship %.0f BGN",social);
        }
        else{
            System.out.println("You cannot get a scholarship!");
        }

    }
}
