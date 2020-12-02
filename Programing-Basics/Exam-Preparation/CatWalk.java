import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class CatWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scan.nextLine());
        int timesWalk = Integer.parseInt(scan.nextLine());
        int caloriesTaken = Integer.parseInt(scan.nextLine());
        int minutesTotal = minutesWalk * timesWalk;
        int caloriesTotal = minutesTotal * 5;
        double percent = caloriesTaken * 50 /100.0;
        if (
                caloriesTotal >= percent)
        System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",caloriesTotal);
                else
                    System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",caloriesTotal);


    }
}
