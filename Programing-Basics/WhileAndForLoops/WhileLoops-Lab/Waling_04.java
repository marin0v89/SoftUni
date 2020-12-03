import java.util.Scanner;

public class Waling_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = 10000;
        String input = scan.nextLine();
        while (!input.equals("Going home")) {
            int walking = Integer.parseInt(input);
            steps = steps - walking;
            if (steps <= 0) {
                break;
            }
            input = scan.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                steps = steps - stepsToHome;
            }


        }
        if (steps <= 0) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", steps);
        }
    }
}
