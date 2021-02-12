package C01.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {
            if ("cancel".equals(input)) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }
            input = scan.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
