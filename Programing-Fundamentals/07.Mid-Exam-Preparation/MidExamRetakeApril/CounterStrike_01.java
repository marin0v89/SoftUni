package MidExamRetakeApril;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int counter = 0;

        while (!"End of battle".equals(input)) {
            int distance = Integer.parseInt(input);
            energy -= distance;
            counter++;
            if (energy - distance < 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", counter, energy);
                return;
            }
            if (counter % 3 == 0) {
                energy += counter;
            }
            input = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d%n", counter, energy);
    }
}
