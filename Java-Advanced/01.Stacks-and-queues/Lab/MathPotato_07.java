package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] people = scan.nextLine().split("\\s+");
        int toss = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        for (String person : people) {
            players.offer(person);
        }
        int n = 1;

        while (players.size() > 1) {
            for (int i = 1; i < toss; i++) {
                String player = players.poll();
                players.offer(player);
            }
            if (isPrime(n)) {
                System.out.println("Prime " + players.peek());
            } else {

                System.out.println("Removed " + players.poll());
            }
            n++;
        }
        System.out.println("Last is " + players.poll());
    }

    private static boolean isPrime(int n) {
        boolean primeCheck = true;
        if (n == 0 || n == 1) {
            primeCheck = false;
            return primeCheck;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % 2 == 0) {
                    primeCheck = false;
                    break;
                }
            }
        }
        return primeCheck;
    }
}
