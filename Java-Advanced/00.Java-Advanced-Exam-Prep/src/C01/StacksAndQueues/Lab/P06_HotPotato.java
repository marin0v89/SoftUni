package C01.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String []input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque <String> players = new ArrayDeque<>();

        for (String s : input) {
            players.offer(s);
        }
        while (players.size()>1){
            for (int i = 1; i <n ; i++) {
                String player = players.poll();
                assert player != null;
                players.offer(player);
                
            }
            System.out.println("Removed "+players.poll());
        }
        System.out.println("Last is "+players.poll());

    }
}
