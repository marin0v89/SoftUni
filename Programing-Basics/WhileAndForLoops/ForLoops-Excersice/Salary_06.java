import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabsCnt = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= tabsCnt; i++) {
            String tabName = scan.nextLine();
            switch (tabName) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }

        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
