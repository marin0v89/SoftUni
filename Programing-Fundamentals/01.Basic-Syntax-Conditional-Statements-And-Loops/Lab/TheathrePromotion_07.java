package Lab;

import java.util.Scanner;

public class TheathrePromotion_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        String output = "Error!";
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    output = "12";
                } else if (age <= 64) {
                    output = "18";
                } else if (age <= 122) {
                    output = "12";
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    output = "15";
                } else if (age <= 64) {
                    output = "20";
                } else if (age <= 122) {
                    output = "15";
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    output = "5";
                } else if (age <= 64) {
                    output = "12";
                } else if (age <= 122) {
                    output = "10";
                }
                break;
        }
        System.out.println(output+"$");
    }
}
