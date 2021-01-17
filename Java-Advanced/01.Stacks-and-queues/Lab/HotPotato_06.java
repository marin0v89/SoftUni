package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] people = scan.nextLine().split("\\s+");
        int toss = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        for (String person : people) {
            players.offer(person);
        }

        while (players.size() > 1) {
            for (int i = 1; i < toss; i++) {
                String player = players.poll();
                players.offer(player);
            }
            System.out.println("Removed " + players.poll());
        }
        System.out.println("Last is " + players.poll());
    }
}
