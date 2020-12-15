package MidExamFebruary;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");

        int startingHealth = 100;
        int bitcoins = 0;
        int roomCount = 1;

        for (String s : input) {
            String[] tokens = s.split(" ");
            String command = tokens[0];
            int points = Integer.parseInt(tokens[1]);

            switch (command) {
                case "potion":
                    int ammountHealed = 100 - startingHealth;
                    startingHealth = Math.min(startingHealth + points, 100);
                    System.out.printf("You healed for %d hp.%n", Math.min(ammountHealed, points));
                    System.out.printf("Current health: %d hp.%n", startingHealth);
                    break;
                case "chest":
                    bitcoins += points;
                    System.out.printf("You found %d bitcoins.%n", points);
                    break;
                default:
                    startingHealth -= points;
                    if (startingHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else if (startingHealth <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", roomCount);
                        return;
                    }

                    break;
            }
            roomCount++;
        }
        if (startingHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", startingHealth);


        }
    }
}
