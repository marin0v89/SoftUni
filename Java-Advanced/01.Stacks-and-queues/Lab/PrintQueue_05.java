package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrintQueue_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {
            if (input.equals("cancel")) {
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
